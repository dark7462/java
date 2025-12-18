package com.dark;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/req_myServlet")
public class myServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		
		
		// after clearing all the filters then only it'll come to the Servlet else it'll be stopped in between and the request never reaches the Servlet
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		
		out.println("welcome : " + name);
		
		
	}
}
