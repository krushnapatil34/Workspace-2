package com;

import java.io.IOException;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet{


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("login Servlet class");
	SessionFactory sf = Hibernateutil.getSessionFactory();
	Session session = sf.openSession();
	String username = request.getParameter("uname");
	System.out.println(username);
	String passward = request.getParameter("pw");
	System.out.println(passward);

	if (username.equals("admin")&& passward.equals("admin"))
	{
		String query="from Student";
		Query q=session.createQuery(query);
		
		List<Student> list =q.getResultList();
		for(Student s: list)
		{
			System.out.println(s.getId());
			System.out.println(s.getUname());
			System.out.println(s.getPw());
		}		
				request.setAttribute("data",list);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
	}
	else
	{ 
		String query="from Student where uname=:username and pw=:password ";
		Query q=session.createQuery(query);
		q.setParameter("u",username);
		q.setParameter("p", passward);
		List<Student> list1=q.getResultList();
		if(list1.size()>0)
		{
			
			System.out.println("login Successfull");
			request.setAttribute("data",list1);
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		
		
	}

	}
}
