	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registration Page</title>
	<script src="js/dinacs.js"></script>
	</head>
	<body>
		<div style="background-color: cyan">
	
			<h1 style="color: blue">Please Enter User Information For
				Register your Self!!!!!!</h1>
			<%
				session.setAttribute("action", "register");
			%>
			<form action="usermngmt" method="post" onsubmit="return validateRegistrationForm()">
	
				<center>
					<table border="1" width="30%" cellpadding="5">
						<thead>
							<tr>
								<th colspan="2">Enter Information Here</th>
							</tr>
						</thead>
						<tbody>
	
	
							<tr>
								<td>Login Id:</td>
								<td><input type="text" type="text" name="id" placeholder="please enter your id" required="true"  maxlength="4"></td>
							</tr>
							
							<tr>
								<td>First Name: </td><td><input id="FName" type="text" name="Fname" placeholder="please enter your firstname" required="true" ><br>
								<br></td>
							</tr>
	
							<tr>
								<td>Last Name:</td><td> <input id="LName" type="text" name="Lname" placeholder="please enter your lastname" required="true"><br>
								<br></td>
							</tr>
							<tr>
								<td>User Name:</td><td> <input id="Uname" type="text" name="Uname" placeholder="please enter your Uname" required="true"><br>
								<br></td>
							</tr>
							<tr>
								<td>Password:</td><td><input id="pass" type="password" name="pass" ><br>
								<br></td>
							</tr>
							<tr>
								<td>Email:</td><td><input type="text" name="email" autocomplete="on"/><br>
								<br></td>
							</tr>
	
							<tr>
								<td>Country:</td> <td><input type="checkbox" name="country"
									value="India">INDIA<br>
								<br>
								<input type="checkbox" name="country" value="USA">USA<br>
								<br>
							
							
								<input type="checkbox" name="country" value="OTHER">OTHER<br>
								<br></td>
							</tr>
							
							
							<tr>
								<td>DOB: </td> <td><input type="date" name="bday"> 
								<br>
									in DD-MM-YYYY Format<br>
								<br></td>
							</tr>
							<tr>
								<td>Gender:</td> <td><input type="radio" name="gender" value="male"
									checked> Male<br>
								<br> <input type="radio" name="gender" value="female">
									Female<br>
								<br> <input type="radio" name="gender" value="other">
									Other<br>
								<br></td>
							</tr>
							<tr>
								<td>Qualification:</td> <td><select size="1" name="qualification">
										<option value="M.Tech">M.Tech</option>
										<option value="M.C.A.">M.C.A.</option>
										<option value="M.B.A.">M.B.A.</option>
										<option value="M.B.B.S">M.B.B.S</option>
										<option value="B.Tech" selected>B.Tech</option>
								</select>
								</td>
							</tr>
	
							<tr>
								<td>Choose A Photo to Upload :</td> <td><input
									type="file" name="file" /> <br>
								<br></td>
							</tr>
	
							<tr>
								<td>Address:</td> <td><input type="text" name="address" /><br>
								<br>
								</td>
							</tr>
	
							<tr>
								<td>Phone Number:</td> <td><input type="number" name="phoneno"
									pattern=".{10}" title="Enter Valid Mob No" required><br>
								<br>
								</td>
							</tr>
	
							<tr align="center">
								<td colspan="2"><input type="submit" value="Submit" />
								<input type="reset" value="Reset" /><br>
								<br></td>
							</tr>
	
							<td colspan="2">Already registered!! <a href="login.jsp">Login
									Here</a></td>
							</tr>
						</tbody>
					</table>
				</center>
			</form>
		</div>
	</body>
	</html>