<%@page import="com.dinacs.usermngmt.model.UserModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<UserModel> usrListvalue = (List)request.getAttribute("listofUser");
%>
<table border="1" bgcolor="yellow" cellpadding="30">
<thead>
<tr>
<th>
UserId:
</th>
<th>
User First name:
</th>
<th>
User Lastst name:
</th>
<th>
User Full name:
</th>
<th>
User email:
</th>
</tr>

</thead>
<%

for(UserModel user : usrListvalue){%>
	
	<tr>
	<td><%= user.getId()%></td>
	
	<td><%= user.getFname()%></td>
	
	<td><%= user.getLname()%></td>
	<td><%= user.getUname()%></td> 
	<td><%= user.getEmail()%></td> 
	<td><a href="usermngmt?action=delete&id=<%= user.getId()%>">delete <br>
 </td>
	</tr><%} %>	
</table>

</body>
</html>