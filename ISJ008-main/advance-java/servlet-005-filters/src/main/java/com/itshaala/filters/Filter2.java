package com.itshaala.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "filter2", urlPatterns = {"/servlet1"})
public class Filter2 implements Filter {
    public Filter2() {
        System.out.println("Filter2 constructor call");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter2 do filter method - pre-processing");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filter2 do filter method - post-processing");

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter2 init method");
    }

    @Override
    public void destroy() {
        System.out.println("Filter2 destroy method");
    }
}
