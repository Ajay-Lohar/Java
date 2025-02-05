package com.itshaala.spring15webappspringboot.dao;

import com.itshaala.spring15webappspringboot.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Value("${spring.application.name}")
    String applicationName;

    public void addCourse(Course course) {
        String query = "insert into course(name, description,price) values(?,?,?)";
        jdbcTemplate.update(query, course.getName(), course.getDescription(), course.getPrice());
        System.out.println(applicationName);
    }
}
