package com;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;


@WebServlet("/edit")
public class UpdateServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Session session = Hibernateutil.getSessionFactory().openSession();
		int id = Integer.parseInt(request.getParameter("rd"));
		Regipojo rg = session.load(Regipojo.class, id);

		rg.setUname(request.getParameter("uname"));
		rg.setPw(request.getParameter("pw"));
		rg.setMailId(request.getParameter("mailId"));
		rg.setName(request.getParameter("name"));
		session.update(rg);

		// rg.setUname(uname);
		// rg.setPw(password);
		// rg.setMailId(mailId);
		// rg.setName(name);
		session.beginTransaction().commit();
		String query = "from Regipojo";
		// List<Regipojo> list=session.createQuery(query).getResultList();
		List<Regipojo> list = session.createQuery(query, Regipojo.class).getResultList();

		for (Regipojo s : list) {
			System.out.println(s.getId());
			System.out.println(s.getUname());
			System.out.println(s.getPw());

		}

		request.setAttribute("data", rg);
		session.beginTransaction().commit();
		RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
	}
}
