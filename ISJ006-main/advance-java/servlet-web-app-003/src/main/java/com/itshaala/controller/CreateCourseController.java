package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/course/create")
public class CreateCourseController extends GenericServlet {

    CourseService courseService = new CourseService();

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //read the input provided by client from query parameters
        int courseId = Integer.parseInt(servletRequest.getParameter("id"));
        String courseName = servletRequest.getParameter("name");
        int coursePrice = Integer.parseInt(servletRequest.getParameter("price"));

        Course course = Course.builder()
                .courseId(courseId)
                .courseName(courseName)
                .coursePrice(coursePrice)
                .build();

       courseService.addCourse(course);
        PrintWriter writer = servletResponse.getWriter();
        writer.println("Course saved successfully");
    }

}
