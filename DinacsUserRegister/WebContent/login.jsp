<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<div class="w3-container w3-red">
  <h1>Dinacs Bank</h1>
</div>
<title>Private Bank</title>
<link rel ="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" type="text/css" href="css/dinacs.css">
<script src="js/dinacs.js"></script>
</head>
<body bgcolor="red">
<div align="center">
<form action="welcome.jsp" method="post" onsubmit="return userValidate();">
User Name: <input id="Uname" type="text" name="Uname">   <br><br>
Password: <input id="pass" type ="password" name = "pass">  <br><br>
   <input type="submit" value="Login" class="dinacs-button">
   
</form>

</div>
</body>

<div id="footer">
Copyright ©2016 dinacs.com,india|Disclaimer|Private Policy
</div>

</html>
