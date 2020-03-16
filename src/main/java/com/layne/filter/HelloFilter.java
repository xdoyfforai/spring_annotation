package com.layne.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author layne staley
 * @date 2020/3/16
 */
@WebFilter("/hello")
public class HelloFilter implements Filter {
  public void init(FilterConfig filterConfig) throws ServletException {
    System.out.println("filter...init...");
  }

  public void doFilter(
      ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
      throws IOException, ServletException {
    System.out.println("filter...doFilter...");
    filterChain.doFilter(servletRequest,servletResponse);
  }

  public void destroy() {
    System.out.println("filter...destroy...");
  }
}
