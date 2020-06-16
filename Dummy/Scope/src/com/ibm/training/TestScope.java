package com.ibm.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class TestScope extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if(request.getParameter("userName") != null) {
//			Add it to the session as well
			request.getSession().setAttribute("userName", request.getParameter("userName"));
		}
		
		PrintWriter out = response.getWriter();
		
		out.println("UserName in request : " + request.getParameter("userName"));
		out.println("UserName in session : " + request.getSession().getAttribute("userName"));
		
		
		
		
	}

}
