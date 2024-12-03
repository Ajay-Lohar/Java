package dao;

import model.Student;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class StudentDao {
    public void addStudent(Student student) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query ="insert into student(name,phone,email,address) values(?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,student.getName());
        preparedStatement.setString(2,student.getPhone());
        preparedStatement.setString(3,student.getEmail());
        preparedStatement.setString(4,student.getAddress());

        preparedStatement.executeUpdate();
        connection.close();
        System.out.println("student add successfully");


    }
}
