package com.cjc.mvccrud.controller;

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

import com.cjc.mvccrud.model.Student;
import com.cjc.mvccrud.service.Servicei;
import com.cjc.mvccrud.serviceImplementation.ServiceImplementation;
import com.cjc.mvccrud.utility.Hibernateutil;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		int id = Integer.parseInt(request.getParameter("rd"));
		System.out.println(id);
		Servicei si=new ServiceImplementation();
		si.delete(id);
		List<Student> list = si.getAlldata();

		request.setAttribute("data", list);
		RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
	}
}
