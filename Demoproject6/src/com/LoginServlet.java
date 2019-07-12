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
	
	Student stu=new Student();
	stu.setId(1);
	stu.setUname("krushna@34");
	stu.setPw("ore");
	
	Student stu1=new Student();
	stu1.setId(2);
	stu1.setUname("krushna553");
	stu1.setPw("mini");
	
	List<Student>list=new ArrayList<>();
	list.add(stu);
	list.add(stu1);
	
	request.setAttribute("data",list);
	RequestDispatcher rd= request.getRequestDispatcher("Success.jsp");
	rd.forward(request, response);

}
}
