package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
@WebServlet("/ed")
public class EditServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	SessionFactory sf = Hibernateutil.getSessionFactory();
	Session session = sf.openSession();

	
	
	int id = Integer.parseInt(request.getParameter("rad"));
	Regipojo rg = session.load(Regipojo.class, id);
	
	Regipojo rgg=session.load(Regipojo.class, id);
	request.setAttribute("data", rgg);
	RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
	rd.forward(request, response);
}
}
