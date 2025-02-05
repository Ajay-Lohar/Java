package com.itshaala.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "filter1", urlPatterns = {"/servlet1"})
public class Filter1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter: doFilter method - preprocessing");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Filter: doFilter method - post-processing");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter : init method");
    }

    @Override
    public void destroy() {
        System.out.println("filter : destroy method");
    }
}
