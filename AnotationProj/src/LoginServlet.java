import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns="/log")
public class LoginServlet extends HttpServlet {
protected void Service(HttpServletRequest request, HttpServletResponse response)
{
System.out.println("hello");	
}
}

