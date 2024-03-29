package com.cjc.mvccrud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjc.mvccrud.model.Student;
import com.cjc.mvccrud.service.Servicei;
import com.cjc.mvccrud.serviceImplimentataion.ServiceImplementation;

@WebServlet(urlPatterns = "/welcome")
public class LoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Login servlet");
		String username = request.getParameter("uname");
		String passward = request.getParameter("pw");
		Servicei si = new ServiceImplementation();
		List<Student> list = si.Checklogin(username, passward);

		request.setAttribute("data",list);
		RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
	}
}
