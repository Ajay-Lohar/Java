package com.itshaala.dao;

import com.itshaala.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseDao {
    public static   List<Course> courses = new ArrayList<Course>();
    public List<Course> getAllCourses() {
        Course course1 = Course.builder()
                .id(101)
                .name("Java")
                .description("fullstack")
                .price(11)
                .build();
        Course course2 = Course.builder()
                .id(102)
                .name("Java")
                .description("backend")
                .price(11)
                .build();
        Course course3 = Course.builder()
                .id(103)
                .name("python")
                .description("fullstack")
                .price(11)
                .build();
        Course course4 = Course.builder()
                .id(104)
                .name("python")
                .description("backend")
                .price(11)
                .build();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        return courses;
    }

    public Course findCourseById(int courseId) {
        return courses.stream().filter(course -> course.getId() == courseId).findFirst().orElse(null);
    }

    public void createCourse(Course course) {
        courses.add(course);
    }
}
