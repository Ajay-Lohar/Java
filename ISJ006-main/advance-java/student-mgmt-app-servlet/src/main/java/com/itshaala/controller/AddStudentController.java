package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/student/add")
public class AddStudentController extends HttpServlet {
    StudentService studentService = new StudentService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = Student.builder()
                .studentId(Integer.parseInt(req.getParameter("id")))
                .studentName(req.getParameter("name"))
                .studentEmail(req.getParameter("email"))
                .studentPhone(req.getParameter("phone"))
                .studentAddress(req.getParameter("address"))
                .build();
        studentService.addStudent(student);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("student/list");
        resp.getWriter().println("Student saved successfully");
    }
}
