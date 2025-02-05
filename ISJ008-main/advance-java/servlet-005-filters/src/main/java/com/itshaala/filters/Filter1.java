package com.itshaala.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "filter1", urlPatterns = {"/servlet1"})
public class Filter1 implements Filter {
    public Filter1() {
        System.out.println("Filter1 constructor call");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter do filter method - pre-processing");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filter do filter method - post-processing");

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init method");
    }

    @Override
    public void destroy() {
        System.out.println("Filter destroy method");
    }
}
