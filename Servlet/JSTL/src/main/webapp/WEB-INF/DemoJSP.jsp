<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<!-- JSTL - jsp stantard tag libreay  --> 
	Hello :- 
	<%
		
		String na = request.getAttribute("key").toString();
		out.println(na);
		out.println("<br>");
	%> 
	<!-- we can direaclty use we don't have to recive any request there -->
	<!-- There's one more way to have variable Directly -->
	My name is ${key.name}
	<br>
	
	<!-- jstl core lib that has been included above is use as :- -->
	<c:out value = "hello word to ${key}"  />
		<br>
	
	
	----------------------- <br>
	
	${list} <br>
	<c:forEach items = "${list}" var = "s" >
		${s.name} -> ${s.rollno} <br>
	</c:forEach>
	

		
</body>
</html>