package io.github.vikeshpandey;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletDemo extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pwriter = res.getWriter();
		String name = req.getParameter("uname");
		pwriter.println("User Details Page:");
		pwriter.println("Hello " + name);
		pwriter.close();
	}
}
