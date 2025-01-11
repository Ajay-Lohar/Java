package dao;

import lombok.SneakyThrows;
import model.Task;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskDao {
    public void addTask(Task task) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query ="insert into task(taskName,taskDescription) values(?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,task.getTaskName());
        preparedStatement.setString(2,task.getTaskDescription());


        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        System.out.println("Task add Successfully");


    }

    public void editTask(Task task) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query ="update task set taskName=?,taskDescription=? where id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,task.getTaskName());
        preparedStatement.setString(2,task.getTaskDescription());
        preparedStatement.setInt(3,task.getId());

        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        System.out.println("Task Edit successfully");

    }

    public void deleteTask(Task task) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();
        String query ="delete from task where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,task.getId());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        System.out.println("Task Delete successfully");
    }

    public void getTaskById(int id) {
        String query = "delete from task where pid=?";
        Connection connection = ConnectionUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Task deleted successfully");

        } catch (SQLException e) {
            System.out.println();
        }
    }



}
