package com.itshaala.controllers;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet(value = "/hello", loadOnStartup = 1)
public class HelloServlet implements Servlet {
    public HelloServlet(){
        System.out.println("com.itshaala.controllers.HelloServlet constructor");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("Good morning .... "+ LocalDateTime.now());

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy method");
    }
}
