package com;

import java.io.IOException;

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
request.setAttribute("msg",2);
Student stu=new Student();
stu.setId(1);
stu.setUname("krushna@34");
stu.setPw("ore");
request.setAttribute("data",stu);
RequestDispatcher rd= request.getRequestDispatcher("Success.jsp");
rd.forward(request, response);
}
}
