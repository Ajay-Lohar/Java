package com.itshaala.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");
        PrintWriter writer = servletResponse.getWriter();
        if ("admin".equals(username) && "admin".equals(password)) {
            //true : create new session object
            //false : get existing session object. do not create new one
            HttpSession httpSession = servletRequest.getSession(true);
            httpSession.setAttribute("username", username);
            httpSession.setAttribute("password", password);
            writer.println("Logged in successfully");
        } else {
            writer.println("Invalid credentials");
        }
    }
}
