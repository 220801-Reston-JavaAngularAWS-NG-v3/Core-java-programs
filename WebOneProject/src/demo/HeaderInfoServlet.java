package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderInfoServlet
 */
@WebServlet("/HeaderInfoServlet")
public class HeaderInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("Request Content Type : " + request.getContentType() + "<br>");
		out.println("Request Loacl Address : " + request.getLocalAddr() + "<br>");
		out.println("Request Local Name : " + request.getLocalName() + "<br>");
		out.println("Request Local Port : " + request.getLocalPort() + "<br>");
		out.println("Request Method : " + request.getMethod() + "<br>");
	
		out.println("Response  Content Type : " + response.getContentType() + "<br>");
		out.println("Response  Buffer Size : " + response.getBufferSize() + "<br>");
		out.println("Response  Status : " + response.getStatus() + "<br>");
		out.println("Response  Locale : " + response.getLocale() + "<br>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
