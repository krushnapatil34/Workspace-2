package com;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("login Servlet");
	
	int id = Integer.parseInt(request.getParameter("rid"));
	System.out.println("id is"+id);

	User u=new User();
	
	
	try {
		System.out.println("...............................");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement smt=con.createStatement();
		String sql="delete from user where id="+id;
		System.out.println(sql);
		smt.executeQuery(sql);
		
		ArrayList<User> a1=new ArrayList();
		String sql1="Select * from user";
		ResultSet rs= smt.executeQuery(sql1);
		while(rs.next())
		{ 
			  
		}
		
	}
	
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
