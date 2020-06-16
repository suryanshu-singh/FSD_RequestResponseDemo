package com.ibm.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sample")
public class SampleServlet extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		Get a reference to the Session
		HttpSession session = request.getSession();
		
		session.setAttribute("userName", "IBM-Training");
		session.setAttribute("userAddress", "Manyata Tech Park");
		
		
//		Delete the session
		session.invalidate();
		
//		response.getWriter().println("Welcome " + request.getSession().getAttribute("userName"));
		
//		request.getRequestDispatcher("nx").forward(request, response);
		
//		response.sendRedirect("nx");
		
	}

}
