<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<div style="background-color:cyan">

<h1 style="color:blue">Please Enter User Information For Register your Self!!!!!!</h1>
 <% 
session.setAttribute("action", "register");

%>
<form action="usermngmt" method="post" enctype="multipart/form-data">



Login Id:<input type="text" type="text" name="id"><br><br>
First Name: <input id ="FName" type="text" name="Fname"><br><br>
Last Name: <input id ="LName" type="text" name="Lname"><br><br>
User Name: <input id="Uname" type="text" name="Uname"><br><br>
Password:<input id="pass" type="password" name="pass"><br><br>
Email:<input type="text" name="email" value="" /><br><br>
Country:  
<input type="checkbox" name="country" value="India">INDIA<br><br>
  <input type="checkbox" name="country" value="USA">USA<br><br>
  <input type="checkbox" name="country" value="OTHER">OTHER<br><br>
DOB: <input type="date" name="bday">
in DD-MM-YYYY Format<br><br>
Gender:<input type="radio" name="gender" value="male" checked> Male<br><br>
  <input type="radio" name="gender" value="female"> Female<br><br>
  <input type="radio" name="gender" value="other"> Other<br><br>
Qualification:<select size="1" name="qualification">
<option value="M.Tech">M.Tech</option>
<option value="M.C.A.">M.C.A.</option>
<option value="M.B.A.">M.B.A.</option>
<option value="M.B.B.S">M.B.B.S</option>
<option value="B.Tech" selected>B.Tech</option>
</select><br><br>
Choose Photo to Upload in Server:

UploadPhoto:<input type="file" name="file" />
<br><br>

Address:<input type="text" name="address" /><br><br>
Phone Number:<input type="number" name="phoneno" pattern=".{10}" title="Enter Valid Mob No" required><br><br>
<input type="submit" value="Submit" />
<input type="reset" value="Reset" /><br><br>
Already registered!!
<a href="login.jsp">Login Here</a>
</form>

</div>
</body>
</html>