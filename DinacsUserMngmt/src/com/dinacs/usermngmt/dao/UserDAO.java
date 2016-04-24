package com.dinacs.usermngmt.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dinacs.usermngmt.model.UserModel;
import com.mysql.jdbc.Connection;

public class UserDAO {
	String driver = "com.mysql.jdbc.Driver";
	List<UserModel> userList = new ArrayList<UserModel>();


	
	public void userRegister(UserModel usrMdlObj) {
		
		//insert data into database
		
		

			    try {
					Class.forName(driver);
					
					Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dinacsdb", "root", "root");

				    Statement st = con.createStatement();
				    
				    String sql = "INSERT INTO USER " + "VALUES ('" + usrMdlObj.getId() + "','" + usrMdlObj.getFname() + "','" + usrMdlObj.getLname() + "','" + usrMdlObj.getUname() + "','" + usrMdlObj.getPass() + "','" + usrMdlObj.getEmail() + "','" + usrMdlObj.getCountry() + "','" + usrMdlObj.getBday() + "','" + usrMdlObj.getGender() + "','" + usrMdlObj.getQualification() + "','" + usrMdlObj.getFile() + "','" + usrMdlObj.getAddress() + "','" +  usrMdlObj.getPhoneno() + "')";
				    
				    System.out.println("Myquery"+sql);

				    st.execute(sql);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}
	
public List<UserModel> getUsers() {
	
	try {
		Class.forName(driver);
		
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dinacsdb", "root", "root");

	    Statement st = con.createStatement();
	    String sql = "SELECT * FROM USER ";
	  ResultSet rs =  st.executeQuery(sql);
	  
	  while (rs.next()) {
		  
		  UserModel usrMdlObj = new UserModel();
		  
	  String userId= rs.getString(1);
	  String userFname= rs.getString(1);
	  String userLname= rs.getString(2);
	  String userFullName= rs.getString(3);
	  String userPasswrd= rs.getString(4);
	  String userCountry= rs.getString(5);
	  String userEmail= rs.getString(6);
	  String userBday= rs.getString(7);
	  String userAddress= rs.getString(8);
	  String userGender= rs.getString(9);
	  String userPhoneNo= rs.getString(10);
	  String userQlyfcation= rs.getString(11);
	  String userPhoto= rs.getString(12);
	  
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
		
		userList.add(usrMdlObj);

	}
	  
	  
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	return userList;
}
}
