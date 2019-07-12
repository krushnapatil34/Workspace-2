import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet(urlPatterns = "/log")
public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		SessionFactory sf = Hibernateutil.getSessionFactory();
		Session session = sf.openSession();

		String uname = request.getParameter("t1");
		System.out.println(uname);
		String passward = request.getParameter("t2");
		System.out.println(passward);

		Student s = new Student();
		s.setRollno(1);
		s.setName("shenal");
		s.setMobnumber(1234566);
		s.setAge(23);
		s.setAddress("dhamangaon");
		/*
		 * PrintWriter out=response.getWriter(); out.write("<html>");
		 * out.write("<head></head>"); out.write("this is response page");
		 */

		request.setAttribute("Student", s);
		RequestDispatcher rd = request.getRequestDispatcher("Success.html");
		rd.forward(request, response);

	}
}
