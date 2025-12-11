<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage = "error.jsp" %> <!--  this redirects the page to the error.jsp where we use the whole jsp file to show the error -->
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
		<%
			int k = 10/0;
		%>
	</body>
</html>