package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns="/second")
public class SecondServlet extends HttpServlet{
@Override

protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("second data");
	String funame=request.getParameter("t1");
	String uname=request.getParameter("t2");
	
	HttpSession session =request.getSession(false);
	session.setAttribute("fdata",funame);
	//session.setAttribute("sdata", funame);
	session.setAttribute("sdata", uname);
	session.removeAttribute("fdata");
	
//	HttpSession session2=request.getSession();
//	session2.setAttribute("s1data", funame);
//	
	
	RequestDispatcher rd=request.getRequestDispatcher("third.jsp");
	rd.forward(request, response);
}
}
