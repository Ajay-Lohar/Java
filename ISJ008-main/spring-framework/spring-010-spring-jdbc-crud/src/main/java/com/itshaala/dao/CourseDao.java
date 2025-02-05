package com.itshaala.dao;

import com.itshaala.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CourseDao {

    JdbcTemplate jdbcTemplate;

    public void addCourse(Course course) {
        String query = "insert into course(name, description, price) values(?,?,?)";
        jdbcTemplate.update(query, course.getName(), course.getDescription(), course.getPrice());
        System.out.println("courses added");
    }
}
