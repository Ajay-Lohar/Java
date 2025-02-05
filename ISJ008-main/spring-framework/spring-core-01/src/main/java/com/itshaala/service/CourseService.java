package com.itshaala.service;

import com.itshaala.dao.CourseDao;

public class CourseService {
    //dependency
    CourseDao courseDao;

    public CourseService(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public void addCourse() {
        courseDao.addCourse();
    }

    public void updateCourse() {
        courseDao.updateCourse();
    }

    public void deleteCourse() {
        courseDao.deleteCourse();
    }

    public void getCourse() {
        courseDao.getCourse();
    }
}
