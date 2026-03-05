<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Welcome to index.jsp file
		form to add 2 number
		<form action = "add" method = "get" >
			<input name = "num1" id = "num1" type = "number"> <br>
			<input name = "num2" id = "num2" type = "number"><br>
			<input type = "submit" value = "click to submit"><br>
		</form>
		form to add a student
		<form action="addStudent">
			<input name = "aid" type = "number"> <br>
			<input name = "aname" type = "text"> <br>
			<input type = "submit">
		</form>
	</body>
</html>