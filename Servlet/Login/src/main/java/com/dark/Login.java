package com.dark;

import com.dark.dao.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		
		// simple static way of loggin in 
//		if(user.equals("user") && pass.equals("pass")) {
//			HttpSession session = request.getSession();
//			session.setAttribute("username", user);
//			response.sendRedirect("Welcome.jsp");
//		}else {
//			response.sendRedirect("Login.jsp");
//		}
		
		// login vai JDBC
		if(LoginDao.check(user,pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", user);
			response.sendRedirect("Welcome.jsp");
		}else {
			response.sendRedirect("Login.jsp");
		}	
	}
}
