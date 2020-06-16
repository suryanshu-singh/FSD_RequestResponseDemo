package com.ibm.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Logic
 */
@WebServlet("/logic")
public class Logic extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		Set the content type
		response.setContentType("text/html");
		
		
		
//		Get the value from form
		String user = request.getParameter("userName");
	
		//Validate the user
		if(user.trim().equals("IBM")) {
			response.getWriter().print("Welcome " + user) ;
		}
		else {
			response.getWriter().print("Invalid username...") ;
			
//			response.sendRedirect("index.html");
			
//			response.sendRedirect("invalid");
			
			
//			Use a RequestDispatcher to forward the same request, response
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			
			//Dispatch the request further
//			dispatcher.forward(request, response);
			dispatcher.include(request, response);
		}
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().println("Post requests now supported...");
		
		doGet(request, response);
	}

}
