package servlet;

import controller.SudentController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/studentEdit")
public class StudentCrudServletEdit extends HttpServlet {
    SudentController studentConroller = new SudentController();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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


}
