package demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//the life cycle methods of a servlet are init(), service() which in turn calls the doGet() or the doPost(), destroy()
// this servlet demo helps us to understands the different stages when the life cycle methods are called
// System.out here refers to tomcat's console

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycleServlet() {
        super();
        System.out.println("LifeCycleServlet : Constructor called....");
    }

    // the init method is called only once in the lifecycle of the servlet
    @Override
	public void init() throws ServletException {
		super.init();
		System.out.println("LifeCycleServlet : init() called....");
	}

    // the doGet()/service() is called every time a request is sent ot he servlet
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LifeCycleServlet : doGet() called....");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LifeCycleServlet : doPost() called....");
		doGet(request, response);
	}

    // the destroy method is called only once in the lifecycle of the servlet
	@Override
	public void destroy() {
		System.out.println("LifeCycleServlet : destroy() called....");
		super.destroy();
	}
	
}
