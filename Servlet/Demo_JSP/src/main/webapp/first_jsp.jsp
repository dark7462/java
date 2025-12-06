<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "cyan">
	<!-- 
		JSP :- Java server pages
		JSP give you everything such as request , response objects , print writer object
		no annotations needed 
		It's basically a simple yet fancy layer sitting above all making dev available with all the things they need
		and later while executing it automatically converts it self into servlet code (session, doGet, doPost)
	 -->
	 
	 <!-- This is derective section all the import statements comes here -->
	 <%@page 
	 	import = "java.util.Date,
	 				java.util.List"
	  %> <br>
	 <!-- This is the Declaration section here we can declare any globle varibles or anything which will not be the part of servlet method -->
	 <%!
	 	int i = 10;
	 %>
	<!-- These are known as script-let  -->
	<% // now inside these percent brackets you'll write the java code which you where writing in the servlet class 
		// this block of code will be replaced with black space in the doGet, doPost, serveice method in the servlet 
		int x = Integer.parseInt(request.getParameter("num"));
		out.println("This is your number : " + x);
		out.println("<br>"); // just for the better format
		out.println("This is the pther numer form top : " + i);
	%> <br>
	<!--  This is known as Expression  -->
	<%= // everything inside this get's printed as it is
		"What ever i ll write here will get printed"
	%><br>
	
</body>
</html>