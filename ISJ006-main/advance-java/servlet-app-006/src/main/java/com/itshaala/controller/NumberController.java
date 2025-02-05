package com.itshaala.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/number")
public class NumberController extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        int number = Integer.parseInt(servletRequest.getParameter("number"));
        if (number % 2 == 0) {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/even");
            requestDispatcher.forward(servletRequest, servletResponse);
        } else {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/odd");
            requestDispatcher.forward(servletRequest, servletResponse);

        }
    }
}
