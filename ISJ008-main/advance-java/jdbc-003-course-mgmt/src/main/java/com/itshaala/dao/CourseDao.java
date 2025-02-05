package com.itshaala.dao;

import com.itshaala.model.Course;
import com.itshaala.utils.ConnectionUtil;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CourseDao {

    @SneakyThrows
    public void addCourse(Course course) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "insert into course(name,description, price) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, course.getName());
        preparedStatement.setString(2, course.getDescription());
        preparedStatement.setInt(3, course.getPrice());
        preparedStatement.executeUpdate();
        System.out.println("course added");
        connection.close();
    }

    @SneakyThrows
    public void updateCourse(Course course) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "update course set name=?, description=?, price=? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, course.getName());
        preparedStatement.setString(2, course.getDescription());
        preparedStatement.setInt(3, course.getPrice());
        preparedStatement.setInt(4, course.getId());
        preparedStatement.executeUpdate();
        System.out.println("course updated");
        connection.close();
    }

    @SneakyThrows
    public void deleteCourseById(int courseId) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "delete from course where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, courseId);
        preparedStatement.executeUpdate();
        System.out.println("course deleted successfully");
        connection.close();
    }

    @SneakyThrows
    public List<Course> findAll() {
        List<Course> courseList = new ArrayList<>();
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();
        String query = "select * from course";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            Course course = Course.builder()
                    .id(resultSet.getInt("id"))
                    .name(resultSet.getString("name"))
                    .description(resultSet.getString("description"))
                    .price(resultSet.getInt("price"))
                    .build();
            courseList.add(course);
        }
        connection.close();
        return courseList;
    }
}
