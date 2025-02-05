package com.itshaala.spring16webservicesspringboot.service;

import com.itshaala.spring16webservicesspringboot.dao.CourseDao;
import com.itshaala.spring16webservicesspringboot.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {
    CourseDao courseDao;

    public void addCourse(Course course) {
        courseDao.save(course);
    }

    public void updateCourse(Course course) {
        courseDao.save(course);
    }

    public void deleteCourse(Course course) {
        courseDao.delete(course);
    }

    public Course findByCourseId(int id) {
        return courseDao.findById(id).get();
    }

    public List<Course> getAllCourses() {
        return courseDao.findAll();
    }
}
