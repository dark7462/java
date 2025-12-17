package com.dark;

import java.io.IOException;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;



@WebServlet("/DemoClass")
public class DemoClass extends HttpServlet{
	public static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name = "Anurag";
		stu s = new stu(name,101);
		req.setAttribute("key", s);
		
		List<stu> students = Arrays.asList(s,new stu("vishal",102));
		req.setAttribute("list", students);
		
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/DemoJSP.jsp");
		rd.forward(req, res);
	}
	
}
