package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String username=request.getParameter("uname");
System.out.println(username);
String password=request.getParameter("pw");
System.out.println(password);

	
	RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
	rd.forward(request, response);


}
}
