import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.setContentType("text/html");

        if(username.equals("admin")&&password.equals("admin")) {
            HttpSession session = req.getSession(true);
            session.setMaxInactiveInterval(50);
            session.setAttribute("username", username);
            session.setAttribute("password", password);

            RequestDispatcher rd = req.getRequestDispatcher("welcome");
            rd.forward(req, resp);
        }else{
            resp.getWriter().println("<h1 style='color:red;'>Invalid Credentials</h1>");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.include(req,resp);
        }
    }
}
