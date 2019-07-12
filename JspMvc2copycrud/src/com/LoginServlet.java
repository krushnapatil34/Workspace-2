package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setAttribute("msg",5);
	
	Student s=new Student();
	s.setId(1);
	s.setUname("krushna@34");
	s.setPw("ore");
	
	Student s1=new Student();
	s1.setId(2);
	s1.setUname("krushna553");
	s1.setPw("mini");
	
	List<Student>list=new ArrayList<>();
	list.add(s);
	list.add(s1);
	
	request.setAttribute("data",list);
	RequestDispatcher rd= request.getRequestDispatcher("Success.jsp");
	rd.forward(request, response);

}
}
