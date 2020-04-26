package com.vikesh.servletconfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pwriter = response.getWriter();
		ServletConfig sc = getServletConfig();

		Enumeration<String> e = sc.getInitParameterNames();
		String str;
		while (e.hasMoreElements()) {
			str = e.nextElement();
			pwriter.println("<br>Param Name: " + str);
			pwriter.println(" value: " + sc.getInitParameter(str));
		}
	}
}
