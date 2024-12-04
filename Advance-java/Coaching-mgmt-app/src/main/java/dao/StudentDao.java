package dao;

import lombok.SneakyThrows;
import model.Student;
import util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
        preparedStatement.close();
        connection.close();
        System.out.println("student add successfully");


    }
    @SneakyThrows
    public void editStudent(Student student) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query ="update student set name=?,phone=?,email=?,address=? where id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,student.getName());
        preparedStatement.setString(2,student.getPhone());
        preparedStatement.setString(3,student.getEmail());
        preparedStatement.setString(4,student.getAddress());
        preparedStatement.setInt(5,student.getId());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        System.out.println("student updated successfully");

    }
    public void deleteStudent(Student student) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query ="delete from student where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,student.getId());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        System.out.println("student deleted successfully");


    }
    @SneakyThrows
    public List<Student> getAllStudents()  {
        Connection connection = ConnectionUtil.getConnection();
        String query ="select * from student";
        List<Student> students = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setPhone(resultSet.getString("phone"));
            student.setEmail(resultSet.getString("email"));
            student.setAddress(resultSet.getString("address"));
            students.add(student);

        }
        statement.close();
        resultSet.close();
        connection.close();
        return students;

    }
    public Student getStudentById(int id) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query ="select * from student where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Student student = new Student();
        while (resultSet.next()) {
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setPhone(resultSet.getString("phone"));
            student.setEmail(resultSet.getString("email"));
            student.setAddress(resultSet.getString("address"));

        }
        preparedStatement.close();
        resultSet.close();
        connection.close();
        return student;
    }
    @SneakyThrows
    public List<Student>getStudentByNameOrPhoneOrEmailOrAddress(String input){
        Connection connection = ConnectionUtil.getConnection();
        String query ="select * from student where name= ? or phone=? or email=? or address=?";
        List<Student> students = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,input);
        preparedStatement.setString(2,input);
        preparedStatement.setString(3,input);
        preparedStatement.setString(4,input);


        ResultSet resultSet = preparedStatement.executeQuery(query);
        while (resultSet.next()) {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setPhone(resultSet.getString("phone"));
            student.setEmail(resultSet.getString("email"));
            student.setAddress(resultSet.getString("address"));
            students.add(student);

        }
        preparedStatement.close();
        resultSet.close();
        connection.close();
        return students;


    }


}
