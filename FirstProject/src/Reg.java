import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
@WebServlet(urlPatterns="/regi")
public class Reg extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Session session=Hibernateutil.getSessionFactory().openSession();
		
		PrintWriter pw=res.getWriter();
		pw.println("hi");
		System.out.println("cnvfjg");
		Customer c=new Customer();
		
		String name= req.getParameter("name");
		String email= req.getParameter("MailId");
		String user= req.getParameter("uname");
		String pass= req.getParameter("pw");
		
		
		c.setName(name);
		c.setEmail(email);
		c.setUsername(user);
		c.setPassword(pass);
		
		session.save(c);
		session.beginTransaction().commit();
		
	}

}
