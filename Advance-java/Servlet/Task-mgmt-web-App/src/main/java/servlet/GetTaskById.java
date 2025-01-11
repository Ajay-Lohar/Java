package servlet;

import controller.TaskController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;

import java.io.IOException;

@WebServlet("/getTaskById")
public class GetTaskById extends HttpServlet {
    TaskController taskController = new TaskController();

//    @SneakyThrows
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        int id = Integer.parseInt(req.getParameter("id"));
//        taskController.getTaskById(id);
//        resp.getWriter().println("Task Get Successfully");
//        resp.getWriter().println(""+id );
//
//
//
//    }
}
