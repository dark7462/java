<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action = "Login" method = "post">
		<input type = "text" name = "username" placeholder = "Enter Username"> <br>
		<input type = "password" name = "password" placeholder = "Enter Password"> <br>
		<input type = "submit" value = "login"> 
	</form>
	<form action = "register.jsp" method = "post">
		<input type = "submit" value = "register">
	</form>
	
</body>
</html>