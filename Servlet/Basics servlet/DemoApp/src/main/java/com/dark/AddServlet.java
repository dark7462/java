package com.dark;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet{
	// service is the only method that deals with web request and response given that we pass the objects
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1")); // res.getprameter give you the input value form the HTML num1 means value at num1
//		int j = Integer.parseInt(req.getParameter("num2")); // we need to type cast it to int cuz be default it's in string
//		int k = i+j;
//		System.out.println(k); // this will give output in the console but not in the web browser
//		
//		PrintWriter out = res.getWriter(); // an object to make things easy
//		
//		out.println("Result is : " + k); // res.getWriter().println(k); now this is short
//		// res.getWriter is a method which gives response to the web server
//	}
	
	private static final long serialVersionUID = 1L;

	// doPost is for giving the output to the server 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1")); 
		int j = Integer.parseInt(req.getParameter("num2")); 
		int k = i+j;
		
		// to directly print the output
//		PrintWriter out = res.getWriter();
//		out.println("Sum = " + k); 
		
		// form above -> how to send request and give response to a webpage directly
		// before dispatching the request you must dispatch the values
//		req.setAttribute("k", k);
		// now how to Dispatch a request to another servlet
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		
		
		// Now how will you redirect the servlet to other servlet
//		res.sendRedirect("sq?k="+k); // this will work as a url to redirect the request with the value of k
		// this comes under session management more specifically URL rewriting
		
		
		// session management
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");
		
		
		// cookies
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
	}
}