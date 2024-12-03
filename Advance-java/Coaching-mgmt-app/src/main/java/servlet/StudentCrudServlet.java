package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import controller.SudentController;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;
import model.Student;

import java.io.IOException;

@WebServlet("/student")
public class StudentCrudServlet  extends HttpServlet {
    SudentController studentConroller = new SudentController();

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");

        Student student = Student.builder()
                .name(name)
                .phone(phone)
                .email(email)
                .address(address)
                .build();

        studentConroller.addStudent(student);
        resp.getWriter().println("Student Add Successfully");
    }
}
