<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>hello guys welcome to sql vai jsp </h2>
	
	<sql:setDataSource var = "db" driver = "com.mysql.jdbc.Driver" url = "jdbc:mysql://localhost:3306/db" user = "root" password = "password"/>
	<sql:query var = "rs" dataSource = "${db}"> select * from example </sql:query>
	
	<c:forEach items = "${rs.rows}" var = "i">
		<c:out value = "${i.roll_no}"/> : <c:out value = "${i.name}"/> <br>
	</c:forEach>
	
</body>
</html>