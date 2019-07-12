import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter("*.do")
public class MyFilter implements Filter {

	@Override
	public void destroy() {
	System.out.println("Distroy method");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain fc)
			throws IOException, ServletException {
	System.out.println("pre processing dofilter");
	fc.doFilter(request, response);
	System.out.println("postprocessing dofilter");
	}

	@Override
	public void init(FilterConfig fcc) throws ServletException {
System.out.println("iside init filterconfig");
		
	}

}
