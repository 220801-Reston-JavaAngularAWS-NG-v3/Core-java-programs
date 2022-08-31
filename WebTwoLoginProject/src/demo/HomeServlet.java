package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// as part of session management using HttpSession
		// now we take out the session attribute userName from the session
		HttpSession sess = request.getSession(); // here the session is already created in LoginServlet,
													// in that case sess will be a part of the ongoing session
		
		String uName = (String) sess.getAttribute("userName");
		
		// if we have reached here, means the login was a success
		PrintWriter print = response.getWriter();
		print.println("<h1>Welcome "+ uName + "!! </h1>");
		
		print.println("<h2>Login Success!!</h2>");
		
		print.println("<h3>Click here to <a href='LogoutServlet'> logout </a></h3>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
