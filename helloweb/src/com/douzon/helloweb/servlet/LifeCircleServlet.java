package com.douzon.helloweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCircleServlet
 */
@WebServlet("/lc")
public class LifeCircleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LifeCircleServlet() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() called");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service() called");
		super.service(request, response);
	}

	public void destroy() {
		System.out.println("destroy() called");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() called");
		
		PrintWriter out=response.getWriter();
		out.println("<h3>Servlet's lifecircle test</h3>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost() called");
	}

}
