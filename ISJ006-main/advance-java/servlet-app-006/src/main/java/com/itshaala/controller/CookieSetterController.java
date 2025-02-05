package com.itshaala.controller;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie")
public class CookieSetterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. create the cookie object
        String username = req.getParameter("username");
        Cookie cookie = new Cookie("username",username);
        //2. set the values to the cookie object
        cookie.setMaxAge(100000);
        //3. add the cookies to the response
        PrintWriter writer = resp.getWriter();
        writer.println("Cookies set");
        resp.addCookie(cookie);
    }
}
