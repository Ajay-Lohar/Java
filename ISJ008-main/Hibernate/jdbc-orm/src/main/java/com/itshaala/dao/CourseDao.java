package com.itshaala.dao;

import com.itshaala.model.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {

    public void addCourse(Course course) {
        String url = "jdbc:mysql://localhost:3306/hibernate_july_2024";
        String username = "root";
        String password = "root";
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into course(name, price) values(?,?)");
            preparedStatement.setString(1, course.getName());
            preparedStatement.setInt(2, course.getPrice());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("issue at db " + e.getMessage());
        }
        System.out.println("Course added successfully");
    }

    public void updateCourse(Course course) {
        String url = "jdbc:mysql://localhost:3306/hibernate_july_2024";
        String username = "root";
        String password = "root";
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            PreparedStatement preparedStatement = connection.prepareStatement("update course set name = ?, price = ? where id = ?");
            preparedStatement.setString(1, course.getName());
            preparedStatement.setInt(2, course.getPrice());
            preparedStatement.setInt(3, course.getId());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("issue at db " + e.getMessage());
        }
        System.out.println("Course updated successfully");
    }

    public List<Course> getAllCourses() {
        List<Course> courseList = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/hibernate_july_2024";
        String username = "root";
        String password = "root";
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from course");
            while (resultSet.next()) {
                Course course = new Course();
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));
                course.setPrice(resultSet.getInt("price"));
                courseList.add(course);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("issue at db " + e.getMessage());
        }
        return courseList;
    }
}
