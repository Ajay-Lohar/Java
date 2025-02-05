package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {
    CourseDao courseDao;

    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }

    public Course findCourseById(int courseId) {
        return courseDao.findCourseById(courseId);
    }

    public void createCourse(Course course) {
        courseDao.createCourse(course);
    }
}
