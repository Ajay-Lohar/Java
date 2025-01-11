package controller;

import model.Task;
import service.TaskService;

import java.sql.SQLException;

public class TaskController {
    TaskService taskService = new TaskService();
    public void addTask(Task task) throws SQLException {
        taskService.addTask(task);
    }
    public void editTask(Task task) throws SQLException {
        taskService.editTask(task);
    }

//    public void getTaskById(int id) {
//        taskService.getTaskById(id);
//
//    }

//    public static void deleteTask(int id) {
//        taskService.deleteTask(id);
//    }
}

