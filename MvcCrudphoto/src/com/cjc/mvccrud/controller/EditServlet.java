package com.cjc.mvccrud.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjc.mvccrud.model.Student;
import com.cjc.mvccrud.service.Servicei;
import com.cjc.mvccrud.serviceImplementation.ServiceImplementation;
@WebServlet("/ed")
public class EditServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	


	int id = Integer.parseInt(request.getParameter("rd"));
	Servicei si=new ServiceImplementation();
	
	Student s= si.edit(id);
	request.setAttribute("data",s);
	RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
	rd.forward(request, response);
}
}
