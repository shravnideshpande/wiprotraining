package com.demoapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginSevlet
 */
public class LoginSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	  //1. get request parameters
	   String uname=request.getParameter("uname");
	   String pwd=request.getParameter("upwd");
	
	  //2. if password is 1234 "Hello <username>" else print "Invalid password"
	   PrintWriter out =response.getWriter();
	   out.println("<html><head><title>Login</title></head><body>");
	   
	   if(pwd.equals("1234")) {
		   out.println("<h2>Welcome"+uname+"<h2>");	   
	   }
	   else {
		   out.println("<h3>invalid password<h3>");
		   
	   }
	   out.println("</body></html>");
	   out.close();
	}

}
