package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormClass extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String name = req.getParameter("user_name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String course = req.getParameter("course");
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>Name "+name+"</h1>");
		out.println("<h1>email "+email+"</h1>");
		out.println("<h1>password "+password+"</h1>");
		out.println("<h1>course "+course+"</h1>");
	} 

	
}
