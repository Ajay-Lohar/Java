import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/prime")
public class PrimeNumberChecker implements Servlet {
    public boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @java.lang.Override
    public void init(ServletConfig servletConfig) {

    }

    @java.lang.Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @java.lang.Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        int number = Integer.parseInt(servletRequest.getParameter("number"));
        PrintWriter writer = servletResponse.getWriter();
        writer.println(isPrime(number)?"Its a prime number "+number:"Its not a prime number "+number);
    }

    @java.lang.Override
    public String getServletInfo() {
        return null;
    }

    @java.lang.Override
    public void destroy() {

    }
}
