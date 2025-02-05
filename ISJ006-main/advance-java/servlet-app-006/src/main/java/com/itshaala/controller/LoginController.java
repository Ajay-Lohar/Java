package com.itshaala.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login1")
public class LoginController extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");

        if ("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)) {
            RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("/welcome");
            requestDispatcher.forward(servletRequest, servletResponse);
        } else {
            servletResponse.getWriter().println("<h1 color='red'>Invalid Credentials</h1>");
            RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("login.jsp");
            requestDispatcher.include(servletRequest, servletResponse);
        }

    }
}
