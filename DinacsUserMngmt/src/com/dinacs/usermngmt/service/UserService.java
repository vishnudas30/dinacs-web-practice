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
	
	
}
