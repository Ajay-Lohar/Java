package servlet;

import controller.TaskController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;
import model.Task;

import java.io.IOException;

@WebServlet("/addTask")
public class AddTaskServlet extends HttpServlet {
        TaskController taskController = new TaskController();

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String taskName = req.getParameter("taskName");
        String taskDescription = req.getParameter("taskDescription");


        Task task = Task.builder()
                .taskName(taskName)
                .taskDescription(taskDescription)
                .build();


        taskController.addTask(task);
        resp.getWriter().println("Task Add Successfully");



    }
}
