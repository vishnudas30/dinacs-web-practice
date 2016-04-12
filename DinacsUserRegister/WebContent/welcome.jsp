<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<jsp:include page="header.jsp"></jsp:include>
<div align="center">
<img src="${pageContext.request.contextPath}/img/logo.jpg"/><br><br>
<%

 String userName = request.getParameter("Uname");
out.println("<b>");

out.println("</n><b>WelCome</b> "+ userName);
out.println("</b>");


%>


<p><b>This is a private Bank of Limited!!!</</b></p><br>

<video controls preload="auto" src="./happybirth_7IUeSa4L.mp4" width="1200" height="400"></video> 


</div>
</body>
<jsp:include page="footer.jsp"></jsp:include>

</html>