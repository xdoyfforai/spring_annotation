import javax.servlet.*;
import java.io.IOException;

/**
 * @author layne staley
 * @date 2020/3/16
 */
public class Hello implements Filter {
  public void init(FilterConfig filterConfig) throws ServletException {
    System.out.println("init...");
  }

  public void doFilter(
      ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
      throws IOException, ServletException {}

  public void destroy() {
    System.out.println("destroy...");
  }
}
