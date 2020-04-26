package io.github.vikeshpandey;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();

		// ServletContext object creation
		ServletContext scontext = getServletContext();

		// fetching values of initialization parameters and printing it
		String userName = scontext.getInitParameter("uname");
		pwriter.println("User name is=" + userName);
		String userEmail = scontext.getInitParameter("email");
		pwriter.println("Email Id is=" + userEmail);
		pwriter.close();
	}
}
