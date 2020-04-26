package io.github.vikeshpandey;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {
			String user = request.getParameter("user");
			String address = request.getParameter("addr");
			out.println("<h2> name is: "+user+"</h2>");
			out.println("<h2> address is: "+address+"</h2>");
		} finally {
			out.close();
		}
		// TODO Auto-generated method stub
		System.out.println("Servlet execution completed successfully");
	}
	
	

}
