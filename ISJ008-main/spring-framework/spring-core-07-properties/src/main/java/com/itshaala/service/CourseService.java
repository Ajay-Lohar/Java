package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseService {
    //automatic dependency

    //@Autowired
    private CourseDao courseDao;

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
