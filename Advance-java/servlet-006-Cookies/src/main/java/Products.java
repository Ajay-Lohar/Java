import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;


// thise page direct url hit the search  bar
@WebServlet("/product")
public class Products extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>products</h1>");
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie :cookies){
            // get mathing the product from db
            writer.println(cookie.getName()+":"+cookie.getValue());

        }
    }
}
