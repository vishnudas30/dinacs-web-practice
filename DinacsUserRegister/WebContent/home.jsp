<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body bgcolor="red">
<jsp:include page="header.jsp"></jsp:include>
<div align="center">
<h1>Welcome to Dinacs Bank </h1>
<a href="login.jsp">Please click here to Login!!!</a>
<%session.setAttribute("name","lisa");
session.setAttribute("pass", "rani");



%>

</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>