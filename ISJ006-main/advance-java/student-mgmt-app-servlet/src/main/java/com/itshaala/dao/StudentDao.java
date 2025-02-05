package com.itshaala.dao;

import com.itshaala.model.Student;
import com.itshaala.util.ConnectionUtil;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    @SneakyThrows
    public void addStudent(Student student) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "insert into student(id, name, email, phone, address) " +
                "values(?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, student.getStudentId());
        preparedStatement.setString(2, student.getStudentName());
        preparedStatement.setString(3, student.getStudentEmail());
        preparedStatement.setString(4, student.getStudentPhone());
        preparedStatement.setString(5, student.getStudentAddress());
        preparedStatement.executeUpdate();
    }

    public void updateStudent(Student student) {
    }

    public void deleteStudent(int studentId) {
    }

    public Student getStudentById(int studentId) {
        return null;
    }


    @SneakyThrows
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        String query = "select * from student";
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            Student student = Student.builder()
                    .studentId(resultSet.getInt("id"))
                    .studentName(resultSet.getString("name"))
                    .studentEmail(resultSet.getString("email"))
                    .studentPhone(resultSet.getString("phone"))
                    .studentAddress(resultSet.getString("address"))
                    .build();
            studentList.add(student);
        }
        return studentList;
    }
}
