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

@WebServlet("/editTask")
public class EditTaskServlet extends HttpServlet {
    TaskController taskController = new TaskController();

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String taskName = req.getParameter("taskName");
        String taskDescription = req.getParameter("taskDescription");
        int id = Integer.parseInt(req.getParameter("id"));
        Task task = Task.builder()
                .id(id)
                .taskName(taskName)
                .taskDescription(taskDescription)
                .build();
        taskController.editTask(task);
        resp.getWriter().println("Task Edit Successfully");
    }
}
