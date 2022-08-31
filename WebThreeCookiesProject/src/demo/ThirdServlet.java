package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		// here we will display information retrieved from the cookies created by FirstServlet and SecondServlet
		// for this to work FirstServlet should create cookies and send it to the client through the response
		
		PrintWriter out = response.getWriter();
		
		// retrieve all the cookies from the request
		Cookie[] allCookies = request.getCookies();
		
		// iterate through the Cookies array and display the info
		for(Cookie eachCookie: allCookies ) {
			out.println("<h2>" + eachCookie.getName() + " : " + eachCookie.getValue() + "</h2><br>");
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
