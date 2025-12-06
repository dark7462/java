package dark;

import java.io.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



// Instead of xml file we can also use annotations like WebServlet to mark the url 
@WebServlet("/fun")
public class function extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.println("<html> <body bgcolor = 'cyan'> ");
		out.println("hi <br>");
		
		ServletContext ctx = getServletContext(); // use this once per JVM (application)
		ServletConfig cg = getServletConfig(); // use this once per servlet 
		// we can make multiple configs for multiple servlets no diffrance in uses
		
		
		String str = ctx.getInitParameter("name");
		out.println(str + " is my name");
		int age = Integer.parseInt(ctx.getInitParameter("age"));
		out.println("I m " + age + " years old");
		
		out.println("</body></html>");
	}
}
