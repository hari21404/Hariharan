package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservelet1 extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			response.setContentType("text/html");      
		       PrintWriter pwriter = response.getWriter();    
		       pwriter.println("<html><body>");
		       pwriter.println("<h2>Html file from Servlet!</h2>");
		       pwriter.println("</body></html>");
		}
}
}