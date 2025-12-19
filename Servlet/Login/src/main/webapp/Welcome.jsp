<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		
		response.setHeader("Cache-Control", "no-chace, no-store, must-revalidate"); // for HTTP 1.1 or newer
		response.setHeader("Pragma", "no-chace"); // for versions older than HTTP 1.0 or older
		response.setHeader("Expires", "0"); // for proxy servers
	
		// These are used for telling the broswer that don't store any chace
		
		
		if(session.getAttribute("username") == null){
			response.sendRedirect("Login.jsp");
		}
	%>
	Welcome.... ${username} <br>
	
	<a href = "Videos.jsp">Videos here..</a> <br>
	<a href = "AboutUs.jsp">About Us..</a>
	
	<form action = "Logout" method = "get">
		<input type = "submit" value = "Logout">
	</form>
</body>
</html>