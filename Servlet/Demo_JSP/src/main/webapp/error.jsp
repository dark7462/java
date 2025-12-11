<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage = "true" %> <!-- isErrorPage allows us to use exception object  -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>	Insert title here</title>
	</head>
	<body bgcolor = "red">
		Error
		<%=
			exception.getMessage()
		%>
	</body>
</html>