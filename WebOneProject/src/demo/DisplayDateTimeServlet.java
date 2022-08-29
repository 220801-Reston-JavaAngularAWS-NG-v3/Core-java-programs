package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayDateTimeServlet
 */
@WebServlet("/DisplayDateTimeServlet")
public class DisplayDateTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// to send the server's date and time to the web browser/ client
		// go for java 1.8 versions LocalDateTime, LocalDate, LocalTime api, these are better than using the java.util.Date API
		LocalDateTime  timestamp = LocalDateTime.now();
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Server's Date and Time : " + timestamp + "</h1>");
		System.out.println("Date Time : " + timestamp);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
