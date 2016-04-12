<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Private Bank</title>
<link rel="stylesheet" type="text/css" href="css/dinacs.css">
<script src="js/dinacs.js"></script>
</head>
<body bgcolor="red">
<jsp:include page="header.jsp"></jsp:include>
<div align="center">
<form action="welcome.jsp" method="post" onsubmit="return userValidate();">
User Name: <input id="Uname" type="text" name="Uname">   <br><br>
Password: <input id="pass" type ="password" name = "pass">  <br><br>
   <input type="submit" value="Login" class="dinacs-button">
   
</form>

</div>
<jsp:include page="footer.jsp"></jsp:include>

</body>


</html>
