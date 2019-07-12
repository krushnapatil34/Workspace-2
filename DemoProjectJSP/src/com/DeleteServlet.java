package com;

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

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SessionFactory sf = Hibernateutil.getSessionFactory();
		Session session = sf.openSession();

		int id = Integer.parseInt(request.getParameter("rd"));
		Regipojo rg = session.load(Regipojo.class, id);
		session.delete(rg);
		session.beginTransaction().commit();
		// response.sendRedirect("Success.jsp");

		String query = "From Regipojo";
		List<Regipojo> list = session.createQuery(query, Regipojo.class).getResultList();

		for (Regipojo s : list) {
			System.out.println(s.getId());
			System.out.println(s.getUname());
			System.out.println(s.getPw());

		}

		request.setAttribute("data", list);
		RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
	}
}
