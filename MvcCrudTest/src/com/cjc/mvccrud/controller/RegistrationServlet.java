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
import com.cjc.mvccrud.serviceImplimentataion.ServiceImplementation;

@WebServlet(urlPatterns = "/regi")
public class RegistrationServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	Student sd=new Student();

	String uname= request.getParameter("uname");
	String password= request.getParameter("pw");
String mailId =request.getParameter("mailId");
String name=request.getParameter("name");

     sd.setUname(uname);
     sd.setPw(password);
     sd.setMailId(mailId);
     sd.setName(name);
     
     Servicei si=new ServiceImplementation();
		si.addStudent(sd);
    
	RequestDispatcher rd= request.getRequestDispatcher("Login.jsp");
	rd.forward(request, response);
	
	
	super.service(request, response);
}
}
