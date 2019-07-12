package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*import org.hibernate.Session;
import org.hibernate.SessionFactory;*/

import com.mysql.jdbc.Connection;

public class RegistrationController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("fullname");
		String email = request.getParameter("email");
		String userName = request.getParameter("userName");
		String pass = request.getParameter("pass");
		String addr = request.getParameter("address");
		String age = request.getParameter("age");

		if (email.equals("")){ 
			System.out.println("inside if");
			/*
							 * || email.isEmpty() || addr.isEmpty()||
							 * userName.isEmpty()||pass.isEmpty() ||
							 * age.isEmpty()
							 */ 
			
			request.setAttribute("data", "<font color=red>Please fill all the fields</font>");
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.include(request, response);

		} else {
			System.out.println("inside else");
			try {
				Class.forName("com.mysql.jdbc.Driver");

				Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root",
						"root");
				String query = "insert into student values(?,?,?,?,?,?)";

				PreparedStatement ps = con.prepareStatement(query); // generates
																	// sql query

				ps.setString(1, name);
				ps.setString(2, email);
				ps.setString(3, userName);
				ps.setString(4, pass);
				ps.setString(5, addr);
				ps.setInt(6, Integer.parseInt(age));

				ps.executeUpdate(); // execute it on test database
				System.out.println("successfuly inserted");
				ps.close();
				con.close();

			} catch (ClassNotFoundException | SQLException e) {

				e.printStackTrace();
			}
 System.out.println("outside if");
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);

		}
	}
}