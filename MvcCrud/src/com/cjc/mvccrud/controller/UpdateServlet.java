 package com.cjc.mvccrud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cjc.mvccrud.model.Student;
import com.cjc.mvccrud.service.Servicei;
import com.cjc.mvccrud.serviceImplementation.ServiceImplementation;
import com.cjc.mvccrud.utility.Hibernateutil;

@WebServlet("/edit")
public class UpdateServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Student sd = new Student();
		Servicei si= new ServiceImplementation();
		int idd = Integer.parseInt(request.getParameter("rad"));
		sd.setId(idd);
		sd.setUname(request.getParameter("uname"));
		sd.setPw(request.getParameter("pw"));
		sd.setMailId(request.getParameter("mailId"));
		sd.setName(request.getParameter("name"));
		si.update(sd);


		// rg.setUname(uname);
		// rg.setPw(password);
		// rg.setMailId(mailId);
		// rg.setName(name);
		//List<Regipojo> list=session.createQuery(query).getResultList();
	


		request.setAttribute("data", si.getAlldata());
		RequestDispatcher rd= request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
	
	}
}
