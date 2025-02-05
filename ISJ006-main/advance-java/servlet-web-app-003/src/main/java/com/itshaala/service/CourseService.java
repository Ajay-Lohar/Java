package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;

import java.util.List;

public class CourseService {
    CourseDao courseDao = new CourseDao();
    public List<Course> getAllCourses(){
        return courseDao.getAllCourses();
    }

    public Course findCourseById(int courseId) {
        return courseDao.findCourseById(courseId);
    }

    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }
}
