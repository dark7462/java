<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Hi guys welcome to the home page</h1>
		
		<form action="getStudents">
			<button> get all students </button>
		</form>
		<form action="getStudentById">
			<input type = "number" name = "id" id = "id">
			<button> get students by id </button>
		</form>
	</body>
</html>