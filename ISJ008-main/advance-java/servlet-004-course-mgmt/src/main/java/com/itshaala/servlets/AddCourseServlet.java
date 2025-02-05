package com.itshaala.servlets;

import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/course/add")
public class AddCourseServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String courseName = servletRequest.getParameter("course_name");
        String courseDescription = servletRequest.getParameter("course_description");
        int coursePrice = Integer.parseInt(servletRequest.getParameter("course_price"));

        Course course = Course.builder()
                .name(courseName)
                .description(courseDescription)
                .price(coursePrice)
                .build();

        CourseController courseController = new CourseController();
        courseController.addCourse(course);
        PrintWriter writer = servletResponse.getWriter();
        writer.println("Course Added Successfully");
    }
}
