package com.dark;

import javax.servlet.http.*;
import java.io.*;

public class SqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		
		// direct output
//		out.println("Sq");
//		int k = Integer.parseInt(req.getParameter("num")); 
//		k*=k;
//		out.println("Square : " + k);
		
		// passing the values
//		int k = (int)req.getAttribute("k");// catching the dispachated request 
//		k = k * k;
//		out.println("sq = " + k);
		
		
		// how to catch the dispatched rediect request
//		int k = Integer.parseInt(req.getParameter("k"));
//		k = k * k;
//		out.println("sq = " + k);
		
		
		// httpsession 
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
//		k = k * k;
//		out.println("Square = " + k);
//		//optional
//		session.removeAttribute("k");
		
		
		// cookies
		
		int k = 0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
				break;
			}
		}
		k = k * k ;
		out.println("Square vai cookie : " + k);
		
		
		
	}
}
