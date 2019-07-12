import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet{
protected void Service(HttpServletRequest request , HttpServletResponse response)
{
System.out.println("hello");	
}
}
