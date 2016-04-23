package com.dinacs.usermngmt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dinacs.usermngmt.model.UserModel;

/**
 * @author Lisa
 *
 */
public class UserController extends HttpServlet {

	
	// unuse method
	/*@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		userLogin(request, response);

		System.out.println("doGet is Called");
	}
*/
	
	
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		System.out.println("doPost is Called");
		HttpSession session = request.getSession();

		String action = (String) session.getAttribute("action");
		System.out.println("action is"+action );
	
		if("login".equalsIgnoreCase(action)){
			System.out.println("calling login method");

		String redirectPage =userLogin(request, response);
		request.setAttribute("errormsg", "Invalid credentilas");
		RequestDispatcher rd = request.getRequestDispatcher("/"+redirectPage);
		rd.forward(request, response);

		}
		
		if("register".equalsIgnoreCase(action)){ 
			System.out.println("calling register method");

		registerUser(request);
		RequestDispatcher rd = request.getRequestDispatcher("/welcome.jsp");
		rd.forward(request, response);

		}
		}

	/**
	 * @param request
	 */
	public void registerUser(HttpServletRequest request) {
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
			redirectPage="welcome.jsp";

		} else {
			redirectPage="login.jsp";

		}
		return redirectPage;
	}
}
