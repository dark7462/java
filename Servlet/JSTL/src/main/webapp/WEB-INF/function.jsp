<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JSTL Functions</h2>
	<c:set var = "str" value = "Hi this is Anurag"/>
	length : ${fn:length(str)}
	<br> <br>
	
	<c:forEach items = "${fn:split(str,' ')}" var = "s">
		${s} <br>
	</c:forEach>
	<br>
	Index of 'is' in the above string : ${fn:indexOf(str,"is")} 
	<br>
	
	<br>
	The string contains 'this' : ${fn:contains(str,"this")}
	<br>
	
	<br>
	<c:if test = "${fn:endsWith(str,'ag')}">
		The string ends with ag
	</c:if>
	<br>
	
</body>
</html>