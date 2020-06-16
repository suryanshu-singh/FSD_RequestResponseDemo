package com.ibm.training;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBConnect
 */
@WebServlet("/db")
public class DBConnect extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm20Jan", "root", "");
		} catch (SQLException e) {
			System.out.println("Can't connect");
		}
		
		
		
		response.getWriter().append("Connected to DB...");
	}

	

}
