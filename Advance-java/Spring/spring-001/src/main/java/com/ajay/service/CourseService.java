package com.ajay.service;

import com.ajay.dao.CourseDao;
import com.ajay.model.Course;

public class CourseService {
    CourseDao courseDao;

    public CourseService(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }
}
