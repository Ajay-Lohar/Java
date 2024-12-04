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
import java.sql.SQLException;
import java.util.List;

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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        List<Student> allStudents = studentConroller.getAllStudents();
        resp.getWriter().println(allStudents);

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        int id =Integer.parseInt( req.getParameter("id"));
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


        try {
            studentConroller.editStudent(student);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        resp.getWriter().println("Student Updated Successfully");


    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        int id = Integer.parseInt( req.getParameter("id"));

        Student student = Student.builder()
                .id(id)
                .build();

        try {
            studentConroller.deleteStudent(student);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        resp.getWriter().println("Student Delete  Successfully");
    }
}
