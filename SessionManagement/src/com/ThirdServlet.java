package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns="/third")
public class ThirdServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Third data");
	String funame=request.getParameter("t1");
	String sec=request.getParameter("t2");
	
	String uname=request.getParameter("t3");
	HttpSession session =request.getSession();
	
	session.setAttribute("sdata", sec);
	session.setAttribute("fdata", funame);
	session.setAttribute("tdata",uname);
	RequestDispatcher rd=request.getRequestDispatcher("Final.jsp");
	rd.forward(request, response);
}
}
