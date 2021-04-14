package com.ibm.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count = 1015;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out  = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<h1>Hello Beautiful World!</h1>");
		out.println("<h2>Welcome to my Hello Servlet</h2>");
		count++;
		out.println("<h3>Your visitor no.:" + count + " </h3>");
		Date now = new Date();
		out.println("<h3>Log: "+ now + "</h3>");
		
	}

}
