package servlets;

import controller.ExpenseController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Expense;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.UUID;


@WebServlet("/expense")
public class ExpenseServlet extends HttpServlet {
    ExpenseController expenseController = new ExpenseController();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String titel = req.getParameter("titel");
        double amount =Double.parseDouble( req.getParameter("amount"));
        LocalDate date =LocalDate.parse( req.getParameter("date"));

        Expense expense  = Expense.builder()
                .date(date)
                .title(titel)
                .amount(String.valueOf(amount))
                .build();

        expenseController.addExpense(expense);

        PrintWriter out = resp.getWriter();
        out.println("Expense Added Successfully");
    }

    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        UUID id = UUID.fromString(req.getParameter("id"));
        String title = req.getParameter("title");
        LocalDate date = LocalDate.parse(req.getParameter("date"));
        double amount = Double.parseDouble(req.getParameter("amount"));


        Expense expense = Expense.builder()
                .id(id)
                .date(date)
                .title(title)
                .amount(String.valueOf(amount))
                .build();

        expenseController.editExpense(expense);

        PrintWriter out = resp.getWriter();
        out.println("Expense Edit Successfully");
    }


}
