package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/course/id")
public class GetCourseByIdController extends GenericServlet {

    CourseService courseService = new CourseService();

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //read the input provided by client from query parameters
        int courseId = Integer.parseInt(servletRequest.getParameter("id"));
        Course course = courseService.findCourseById(courseId);
        PrintWriter writer = servletResponse.getWriter();
        writer.println(course);
    }

}
