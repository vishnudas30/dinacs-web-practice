<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/dinacs.css">

</head>
<body bgcolor="red">
<div align="center">
<form action="welcome.jsp" method="post">
User Name: <input type="text" name="Uname">   <br><br>
Password: <input type ="password" name = "pass">  <br><br>
   <input type="submit" value="Login" onclick="userValidate()" class="dinacs-button">
   
</form>

</div>
</body>
<script type="text/javascript">

function userValidate(){
	alert("hi");
	var userName = document.getElementsByName("Uname").value();
	var passWord = document.getElementsByName("pass").value();
	
	alert(userName);
	alert(passWord);

	
	if(userName==null || userName==" "){
		alert("Please enter the userName");
		//alert("Please enter the passWord");
			
	}
	
	if(passWord==null || passWord==" "){
		alert("Please enter the passWord");
			
	}
	
	
}

</script>


</html>
