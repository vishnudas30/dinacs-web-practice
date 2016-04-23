<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dinacs Bank UserList</title>
</head>
<body>
	<h1>Dinacs Bank UserList!!!!</h1>
	<form method="post" action="registration.jsp">
		<center>
			<table border="1" width="30%" cellpadding="5">
				<thead>
					<tr>
						<th colspan="2">Enter Information Here</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>User Id</td>
						<td><input type="text" name="Id" value="" /></td>
					</tr>
					<tr>
						<td>First Name</td>
						<td><input type="text" name="Fname" value="" /></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><input type="text" name="Lname" value="" /></td>
					</tr>
					<tr>
						<td>UserFull Name</td>
						<td><input type="text" name="Uname" value="" /></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="pass" value="" /></td>
					</tr>

					<tr>
						<td>country</td>
						<td><input type="text" name="country" value="" /></td>
					</tr>


					<tr>
						<td>bday</td>
						<td><input type="text" name="bday" value="" /></td>
					</tr>
					<tr>
						<td>gender</td>
						<td><input type="text" name="gender" value="" /></td>
					</tr>
					<tr>
						<td>qualification</td>
						<td><input type="text" name="qualification" value="" /></td>
					</tr>
					<tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name="email" value="" /></td>
					</tr>
					<tr>
						<td>User Address</td>
						<td><input type="text" name="address" value="" /></td>
					</tr>
					<tr>
						<td>User PhoneNumber</td>
						<td><input type="text" name="phoneno" value="" /></td>
					</tr>
					<tr>
						<td>User Photo</td>
						<td><input type="text" name="file" value="" /></td>
					</tr>

					<tr>
						<td><input type="submit" value="Submit" /></td>
						<td><input type="reset" value="Reset" /></td>
					</tr>
					<tr>
						<td colspan="2">Already registered!! <a href="login.jsp">Login
								Here</a></td>
					</tr>
				</tbody>
			</table>
		</center>
		
		
		
		List<User> userList = userModel.getAllUsers();
       UserTableItemModel tiModel = new UserTableItemModel(userList);
       String[][] data = new String[userList.size()][col_user.length];
      int i = 0;
        for (User user : userList) {
        String[] userdata = new String[col_user.length];
        userdata[0] = user.getUserUsername();
        userdata[1] = user.getUserName();
        userdata[2] = user.getUserPhone();
        data[i++] = userdata;
	</form>
</body>
</html>