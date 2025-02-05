package com.itshaala.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "auth", urlPatterns = {"/welcome"})
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("admin".equals(username) && "admin".equals(password)) {
           filterChain.doFilter(req,resp);
        } else {
            //login page
            resp.setContentType("text/html");
            PrintWriter writer = resp.getWriter();
            writer.println("<h1 style=\"color:red\"> Invalid Credentials</h1>");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.html");
            requestDispatcher.include(req, resp);
        }
    }
}
