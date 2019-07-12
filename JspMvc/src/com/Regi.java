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
public class Regi {
	
	@WebServlet(urlPatterns="/regi")
	public class Reg extends HttpServlet {
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			Session session=Hibernateutil.getSessionFactory().openSession();
			
			RegiPojo c=new RegiPojo();
			
			Transaction t = session.beginTransaction();
			
			PrintWriter pw=res.getWriter();
			pw.println("you have registerd Successfully");
			
			String id = req.getParameter("id");
			String name= req.getParameter("name");
			String email= req.getParameter("MailId");
			String user= req.getParameter("uname");
			String pass= req.getParameter("pw");
			
			c.setName(name);
			c.setEmail(email);
			c.setUser(user);
			c.setPass(pass);
			RequestDispatcher rd= req.getRequestDispatcher("Registration.jsp");
		
			
			session.save(c);
			t.commit();
			
		}

	}

}
