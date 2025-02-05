package com.itshaala.spring15webappspringboot.service;

import com.itshaala.spring15webappspringboot.dao.CourseDao;
import com.itshaala.spring15webappspringboot.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseService {
    CourseDao courseDao;
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }
}
