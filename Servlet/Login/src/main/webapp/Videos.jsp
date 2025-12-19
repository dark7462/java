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
		response.setHeader("Cache-Control", "no-chace, no-store, must-revalidate");
		if(session.getAttribute("username") == null){
			response.sendRedirect("Login.jsp");
		}
	%>
	
	<form action = "Logout" method = "get">
		<input type = "submit" value = "Logout">
	</form>
	Here are your videos... <br>
	name : ${user} <br>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/4XTsAAHW_Tc?si=jkmWVwNa3QF0-mic" title="YouTube video"></iframe>
	
</body>
</html>