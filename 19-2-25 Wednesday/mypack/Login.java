package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Ensure your class extends HttpServlet
public class Login extends HttpServlet {  
    private static final long serialVersionUID = 1L;

    // Handles GET requests (when accessed via browser)
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<h2>Welcome to the Login Page</h2>");
        writer.println("<form action='login' method='post'>");
        writer.println("Username: <input type='text' name='username'><br><br>");
        writer.println("Password: <input type='password' name='password'><br><br>");
        writer.println("<input type='submit' value='Login'>");
        writer.println("</form>");
        writer.println("</body></html>");
    }

    // Handles POST requests (when form is submitted)
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<h2>Username: " + username + "<br/>");
        writer.println("Password: " + password + "</h2>");
        writer.println("</body></html>");
    }
}
