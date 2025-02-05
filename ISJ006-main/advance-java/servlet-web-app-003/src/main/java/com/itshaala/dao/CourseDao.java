package com.itshaala.dao;

import com.itshaala.model.Course;
import com.itshaala.util.ConnectionUtil;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    @SneakyThrows
    public List<Course> getAllCourses() {
        List<Course> courseList = new ArrayList<>();
        Connection connection = ConnectionUtil.getConnection();
        String query = "select * from course";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            Course course = Course.builder()
                    .courseId(resultSet.getInt("id"))
                    .courseName(resultSet.getString("course_name"))
                    .coursePrice(resultSet.getInt("price"))
                    .build();
            courseList.add(course);
        }
        return courseList;
    }

    @SneakyThrows
    public Course findCourseById(int courseId) {
        Course course = null;
        Connection connection = ConnectionUtil.getConnection();
        String query = "select * from course where id=" + courseId + " limit 1";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            course = Course.builder()
                    .courseId(resultSet.getInt("id"))
                    .courseName(resultSet.getString("course_name"))
                    .coursePrice(resultSet.getInt("price"))
                    .build();
        }
        return course;
    }

    @SneakyThrows
    public void addCourse(Course course) {
        String query = "insert into course(id, course_name, price) values(?,?,?)";

        Connection connection = ConnectionUtil.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, course.getCourseId());
        preparedStatement.setString(2, course.getCourseName());
        preparedStatement.setInt(3, course.getCoursePrice());

        preparedStatement.executeUpdate();
    }
}
