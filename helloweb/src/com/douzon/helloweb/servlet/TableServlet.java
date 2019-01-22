package com.douzon.helloweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableServlet
 */
@WebServlet("/Table")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public TableServlet() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String row = request.getParameter("r");
		String col = request.getParameter("c");
		int nRow = 1;
		if (row != null)
			nRow = Integer.parseInt(row);
		int nCol = 1;
		if (col != null)
			nCol = Integer.parseInt(col);
		
		PrintWriter out=response.getWriter();
		out.print("<table border='3px' cellspacing='0' cellpadding='5px'>");
		for (int i = 0; i < nRow; i++) {
		out.print("<tr>");
		for (int j = 0; j < nCol; j++) {
			out.print("<td>");
			out.print("col("+i+","+j+")");
			out.print("</td>");
		}
		out.print("</tr>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
