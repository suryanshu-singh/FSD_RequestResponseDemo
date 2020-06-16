package com.ibm.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logic")
public class Logic extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		response.getWriter().println("Welcome " + request.getSession().getAttribute("userName"));
		response.getWriter().println("Your address: " + request.getSession().getAttribute("userAddress"));
		
		
	}

}
