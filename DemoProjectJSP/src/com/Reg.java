package com;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
@WebServlet(urlPatterns="/regi")
public class Reg extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Session session=Hibernateutil.getSessionFactory().openSession();
		
		Regipojo c=new Regipojo();
		
		Transaction t = session.beginTransaction();
		
		PrintWriter pw1=response.getWriter();
		pw1.println("you have registerd Successfully");
		
		//int id = request.getContentLength();
		String uname= request.getParameter("uname");
		String password= request.getParameter("pw");
	String mailId =request.getParameter("mailId");
	String name=request.getParameter("name");
 
	     c.setUname(uname);
	     c.setPw(password);
	     c.setMailId(mailId);
	     c.setName(name);
	    
		RequestDispatcher rd= request.getRequestDispatcher("Registration.jsp");
	
		
		session.save(c);
		t.commit();
		
	}

}
