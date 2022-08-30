package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// here the request parameters are received in the incomming request
		// so we have take out the request parameters from the incomming request
		String uname = request.getParameter("username");
		String password = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		
		// next i am performing a hard coded validation of username and password
		if("admin".equals(uname) && "admin".equals(password)) {
			out.println("<h2>Login successfull!!<h2>");
		}else {
			out.println("<h2>Login failed!!<h2>");
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
