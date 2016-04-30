package com.dinacs.usermngmt.controller;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.realm.UserDatabaseRealm;

import com.dinacs.usermngmt.dao.UserDAO;
import com.dinacs.usermngmt.model.UserModel;
import com.dinacs.usermngmt.service.UserService;
import com.mysql.jdbc.Connection;

/**
 * @author Lisa
 *
 */
public class UserController extends HttpServlet {
	List<UserModel> userList = new ArrayList<UserModel>();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		System.out.println("action is" + action);
		if ("listusers".equalsIgnoreCase(action)) {

			System.out.println("calling doGet method");

			UserService userServiceObj = new UserService();
			userList = userServiceObj.getUsers();
			request.setAttribute("listofUser", userList);
			RequestDispatcher rd = request.getRequestDispatcher("/userlist.jsp");
			rd.forward(request, response);
		}

		if ("delete".equalsIgnoreCase(action)) {

			System.out.println("calling doGet method");

			UserService userServiceObj = new UserService();
			String Id = request.getParameter("id");
			System.out.println("deleting user");

			userServiceObj.deleteUser(Id);

			userList = userServiceObj.getUsers();

			request.setAttribute("listofUser", userList);
			RequestDispatcher rd = request.getRequestDispatcher("/userlist.jsp");
			rd.forward(request, response);
		}
		
		
		if ("getUserData".equalsIgnoreCase(action)) {

			System.out.println("calling doGet method");

			UserService userServiceObj = new UserService();
			String Id = request.getParameter("id");

			UserModel usrMdlObj = new UserModel();
UserModel userModelObj	=	userServiceObj.getUserData(Id);


			request.setAttribute("userModelObj", userModelObj);
			RequestDispatcher rd = request.getRequestDispatcher("/update.jsp");
			rd.forward(request, response);
		}
		

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doPost is Called");
		HttpSession session = request.getSession();

		String whatIwanttoDo = (String) session.getAttribute("action");
		System.out.println("action is" + whatIwanttoDo);

		String userId = request.getParameter("id");
		System.out.println("user Id is  in do post method is:" + userId);

		if ("login".equalsIgnoreCase(whatIwanttoDo)) {

			System.out.println("calling login method");

			String redirectPage = userLogin(request, response);
			request.setAttribute("errormsg", "Invalid credentilas");
			RequestDispatcher rd = request.getRequestDispatcher("/" + redirectPage);
			rd.forward(request, response);

		}

		if ("register".equalsIgnoreCase(whatIwanttoDo)) {
			System.out.println("calling register method");

			List<UserModel> userList = registerUser(request);
			request.setAttribute("listofUser", userList);
			RequestDispatcher rd = request.getRequestDispatcher("/userlist.jsp");
			rd.forward(request, response);

		}
		
		if ("update".equalsIgnoreCase(whatIwanttoDo)) {
			System.out.println("calling update method");

			List<UserModel> userList = updateUser(request);
			request.setAttribute("listofUser", userList);
			RequestDispatcher rd = request.getRequestDispatcher("/userlist.jsp");
			rd.forward(request, response);

		}
		
		
	}

	private List<UserModel> updateUser(HttpServletRequest request) {
		String userId = request.getParameter("id");
		System.out.println("user Id is :" + userId);

		String userFname = request.getParameter("Fname");
		System.out.println("user Firstname is :" + userFname);

		String userLname = request.getParameter("Lname");
		System.out.println("user Lastname is :" + userLname);

		String userFullName = request.getParameter("Uname");
		System.out.println("user Fullname is :" + userFullName);

		String userPasswrd = request.getParameter("pass");
		System.out.println("user Password is :" + userPasswrd);

		String userEmail = request.getParameter("email");
		System.out.println("user Email is :" + userEmail);

		String userCountry = request.getParameter("country");
		System.out.println("user Country name is :" + userCountry);

		String userBday = request.getParameter("bday");
		System.out.println("user Birthday is :" + userBday);

		String userGender = request.getParameter("gender");
		System.out.println("user gender name is :" + userGender);

		String userQlyfcation = request.getParameter("qualification");
		System.out.println("user qualification is :" + userQlyfcation);

		String userPhoto = request.getParameter("file");
		System.out.println("user photo file name is :" + userPhoto);

		String userAddress = request.getParameter("address");
		System.out.println("user address is :" + userAddress);

		String userPhoneNo = request.getParameter("phoneno");
		System.out.println("user phone number is :" + userPhoneNo);
		UserModel usrMdlObj = new UserModel();

		usrMdlObj.setId(userId);
		usrMdlObj.setFname(userFname);
		usrMdlObj.setLname(userLname);
		usrMdlObj.setUname(userFullName);
		usrMdlObj.setPass(userPasswrd);
		usrMdlObj.setCountry(userCountry);
		usrMdlObj.setEmail(userEmail);
		usrMdlObj.setBday(userBday);
		usrMdlObj.setAddress(userAddress);
		usrMdlObj.setGender(userGender);
		usrMdlObj.setPhoneno(userPhoneNo);
		usrMdlObj.setQualification(userQlyfcation);
		usrMdlObj.setFile(userPhoto);

		UserService userServiceObj = new UserService();
		userServiceObj.updateUser(usrMdlObj);

		userList = userServiceObj.getUsers();

		return userList;
	}

	/**
	 * @param request
	 */
	public List<UserModel> registerUser(HttpServletRequest request) {
		String userId = request.getParameter("id");
		System.out.println("user Id is :" + userId);

		String userFname = request.getParameter("Fname");
		System.out.println("user Firstname is :" + userFname);

		String userLname = request.getParameter("Lname");
		System.out.println("user Lastname is :" + userLname);

		String userFullName = request.getParameter("Uname");
		System.out.println("user Fullname is :" + userFullName);

		String userPasswrd = request.getParameter("pass");
		System.out.println("user Password is :" + userPasswrd);

		String userEmail = request.getParameter("email");
		System.out.println("user Email is :" + userEmail);

		String userCountry = request.getParameter("country");
		System.out.println("user Country name is :" + userCountry);

		String userBday = request.getParameter("bday");
		System.out.println("user Birthday is :" + userBday);

		String userGender = request.getParameter("gender");
		System.out.println("user gender name is :" + userGender);

		String userQlyfcation = request.getParameter("qualification");
		System.out.println("user qualification is :" + userQlyfcation);

		String userPhoto = request.getParameter("file");
		System.out.println("user photo file name is :" + userPhoto);

		String userAddress = request.getParameter("address");
		System.out.println("user address is :" + userAddress);

		String userPhoneNo = request.getParameter("phoneno");
		System.out.println("user phone number is :" + userPhoneNo);
		UserModel usrMdlObj = new UserModel();

		usrMdlObj.setId(userId);
		usrMdlObj.setFname(userFname);
		usrMdlObj.setLname(userLname);
		usrMdlObj.setUname(userFullName);
		usrMdlObj.setPass(userPasswrd);
		usrMdlObj.setCountry(userCountry);
		usrMdlObj.setEmail(userEmail);
		usrMdlObj.setBday(userBday);
		usrMdlObj.setAddress(userAddress);
		usrMdlObj.setGender(userGender);
		usrMdlObj.setPhoneno(userPhoneNo);
		usrMdlObj.setQualification(userQlyfcation);
		usrMdlObj.setFile(userPhoto);

		UserService userServiceObj = new UserService();
		userServiceObj.userRegisterService(usrMdlObj);

		userList = userServiceObj.getUsers();

		return userList;

	}

	/**
	 * @param request
	 * @param response
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	public String userLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String redirectPage = null;

		HttpSession session = request.getSession();

		String userName = request.getParameter("Uname");
		String userPass = request.getParameter("pass");
		String name = (String) session.getAttribute("name");
		String pass = (String) session.getAttribute("pass");
		System.out.println("user name is :" + userName);
		System.out.println("password is :" + userPass);
		if (userName.equals(name) && userPass.equals(pass)) {
			redirectPage = "welcome.jsp";

		} else {
			redirectPage = "login.jsp";

		}
		return redirectPage;
	}
}
