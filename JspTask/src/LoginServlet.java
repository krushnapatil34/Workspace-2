import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.PortableInterceptor.SUCCESSFUL;

@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("login Servlet class");

String username = request.getParameter("t1");
System.out.println(username);
String passward = request.getParameter("t2");
System.out.println(passward);

if (username.equals("admin")&& passward.equals("admin"))
{
	RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
	rd.forward(request, response);
}
else
{ 
	RequestDispatcher rd = request.getRequestDispatcher("Login.html");
	rd.forward(request, response);
}

}
}
