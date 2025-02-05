package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/student/list")
public class ListStudentsController extends HttpServlet {
    StudentService studentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = studentService.getAllStudents();
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<table>" +
                "<tr>" +
                "<th>ID</th>" +
                "<th>Name</th>" +
                "<th>Email</th>" +
                "<th>Phone</th>" +
                "<th>Address</th>" +
                "</tr>");
        for (Student student : studentList) {

            writer.println("<tr>");
            writer.println("<td>");
            writer.println(student.getStudentId());
            writer.println("</td>");
            writer.println("</tr>");


            writer.println("<tr>");
            writer.println("<td>");
            writer.println(student.getStudentName());
            writer.println("</td>");
            writer.println("</tr>");

            writer.println("<tr>");
            writer.println("<td>");
            writer.println(student.getStudentEmail());
            writer.println("</td>");
            writer.println("</tr>");

            writer.println("<tr>");
            writer.println("<td>");
            writer.println(student.getStudentPhone());
            writer.println("</td>");
            writer.println("</tr>");

            writer.println("<tr>");
            writer.println("<td>");
            writer.println(student.getStudentAddress());
            writer.println("</td>");
            writer.println("</tr>");
        }

        writer.println("</table>");
    }
}
