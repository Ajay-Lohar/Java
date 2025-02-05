package com.itshaala.dao;

import com.itshaala.model.Student;
import com.itshaala.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public void addStudent(Student student) {
        String query = "insert into isj006_advance.student(id, name, address, email, phone) values(?,?,?,?,?)";
        Connection connection = ConnectionUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getAddress());
            preparedStatement.setString(4, student.getEmail());
            preparedStatement.setString(5, student.getPhone());

            preparedStatement.executeUpdate();
            System.out.println("Student Record added in the table");

        } catch (SQLException e) {
            System.out.println("issue in compiling the query");
        }
    }

    public void editStudent(Student student) {
        String query = "update isj006_advance.student set name=?, address=?, email=?,phone=? where id=?";
        Connection connection = ConnectionUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getAddress());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getPhone());
            preparedStatement.setInt(5, student.getId());

            preparedStatement.executeUpdate();
            System.out.println("Student Record updated in the table");

        } catch (SQLException e) {
            System.out.println("issue in compiling the query");
        }
    }

    public void deleteStudent(int id) {
        String query = "delete from isj006_advance.student where id=?";
        Connection connection = ConnectionUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Student Record Deleted from the table");
        } catch (SQLException e) {
            System.out.println("issue in compiling the query");
        }
    }

    public Student getStudentById(int id) {
        String query = "select * from isj006_advance.student where id=? limit 1";
        Connection connection = ConnectionUtil.getConnection();
        Student student = new Student();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAddress(resultSet.getString("address"));
                student.setEmail(resultSet.getString("email"));
                student.setPhone(resultSet.getString("phone"));
            }
        } catch (SQLException e) {
            System.out.println("issue in compiling the query");
        }
        return student;
    }

    public List<Student> getAllStudents() {
        String query = "select * from isj006_advance.student";
        Connection connection = ConnectionUtil.getConnection();
        List<Student> studentList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAddress(resultSet.getString("address"));
                student.setEmail(resultSet.getString("email"));
                student.setPhone(resultSet.getString("phone"));
                studentList.add(student);
            }
        } catch (SQLException e) {
            System.out.println("issue in compiling the query");
        }
        return studentList;
    }
}
