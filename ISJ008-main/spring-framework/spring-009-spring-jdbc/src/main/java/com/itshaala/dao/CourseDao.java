package com.itshaala.dao;

import com.itshaala.model.Course;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class CourseDao {
    JdbcTemplate jdbcTemplate;

    public void addCourse(Course course) {
        String query = "insert into course(name,description, price) values(?,?,?)";
        jdbcTemplate.update(query, course.getName(), course.getDescription(), course.getPrice());
        System.out.println("course added");
    }

    public void updateCourse(Course course) {
        String query = "update course set name=?, description=?, price=? where id=?";
        jdbcTemplate.update(query, course.getName(), course.getDescription(), course.getPrice(), course.getId());
        System.out.println("course updated");
    }

    public void deleteCourseById(int courseId) {
        String query = "delete from course where id=?";
        jdbcTemplate.update(query, courseId);
        System.out.println("course deleted successfully");
    }

    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        String query = "select * from course";
        jdbcTemplate.query(query,
                rs -> {
                    Course course = Course.builder()
                            .id(rs.getInt("id"))
                            .name(rs.getString("name"))
                            .description(rs.getString("description"))
                            .price(rs.getInt("price"))
                            .build();
                    courses.add(course);
                });
        return courses;
    }
}
