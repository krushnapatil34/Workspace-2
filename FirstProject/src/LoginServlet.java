import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request,HttpServletResponse response)
	{
		//System.out.println("hello");
		SessionFactory sf= Hibernateutil.getSessionFactory();
		Session session =sf.openSession();
		//System.out.println("hh");
		
	}
}
