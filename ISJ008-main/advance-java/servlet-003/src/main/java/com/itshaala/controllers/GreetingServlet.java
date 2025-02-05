package com.itshaala.controllers;


import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class GreetingServlet extends GenericServlet {
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, java.io.IOException {
        servletResponse.setContentType("text/html");
        java.io.PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1> Good morning </h1>");
    }
}
