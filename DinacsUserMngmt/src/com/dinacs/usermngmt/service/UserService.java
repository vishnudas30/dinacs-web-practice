package com.dinacs.usermngmt.service;

import java.util.List;

import com.dinacs.usermngmt.dao.UserDAO;
import com.dinacs.usermngmt.model.UserModel;

public class UserService {
	public void userRegisterService(UserModel usrMdlObj) {
		
		UserDAO dao = new UserDAO();
		dao.userRegister(usrMdlObj);
	}  

	
	
	public List<UserModel> getUsers() {
		UserDAO dao = new UserDAO();
		return dao.getUsers();
	}



	public void deleteUser(String id) {
		System.out.println("deleting user");

		UserDAO dao = new UserDAO();
		dao.deleteUser(id);
	}



	public UserModel getUserData(String id) {
		UserDAO dao = new UserDAO();
		
		
return dao.getUserData(id);
		
		
	}



	public void updateUser(UserModel usrMdlObj) {
	UserDAO dao = new UserDAO();
	dao.updateUser(usrMdlObj);
	}
	
	
}
