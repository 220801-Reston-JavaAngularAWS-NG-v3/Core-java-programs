package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		response.setContentType("text/html");
		// next i am performing a hard coded validation of username and password
		if("admin".equals(uname) && "admin".equals(password)) {
			// means the login is a success
			
			// this line is commented because we are going to forward the request and response to HomeServlet
			//out.println("<h2>Login successfull!!<h2>");
			
			// as part of session mamangement, we want to send the user name to the HomeServlet to be displayed
			// we can attach the username inthe HttpSession
			
			HttpSession session = request.getSession(); // this creates a session, if one does not exist
			session.setAttribute("userName", uname); // setting the username as an attribute to the session
			
			// request and response can be forwarded using RequestDispatcher
			RequestDispatcher rd = request.getRequestDispatcher("HomeServlet");
			rd.forward(request,  response);
			
		}else {
			// means login is a failure
			
			// this line is commented because we are going to forward the request and response to OutputServlet
			//out.println("<h2>Login failed!!<h2>");
			
			// request and response can be forwarded using RequestDispatcher
			RequestDispatcher rd = request.getRequestDispatcher("OutputServlet");
			rd.forward(request,  response);
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
