package com.itshaala.controller;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/prime", loadOnStartup = 1)
public class PrimeNumberController extends GenericServlet {
    public PrimeNumberController() {
        System.out.println("PrimeNumberController constructor");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        int number = Integer.parseInt(servletRequest.getParameter("number"));
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        PrintWriter writer = servletResponse.getWriter();
        writer.println(isPrime ? "Its prime number " + number : "its not a prime number " + number);
    }
}
