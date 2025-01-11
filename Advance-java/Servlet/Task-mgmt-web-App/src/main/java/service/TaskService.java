package service;

import dao.TaskDao;
import model.Task;

import java.sql.SQLException;

public class TaskService {

    TaskDao taskDao = new TaskDao();
    public void addTask(Task task) throws SQLException{
            taskDao.addTask(task);
        }


    public void editTask(Task task) throws SQLException {
        taskDao.editTask(task);
    }

    public void deleteTask(Task id) throws SQLException{
        taskDao.deleteTask(id);
    }

    public void getTaskById(int id) throws SQLException {
        taskDao.getTaskById(id);
    }


}



