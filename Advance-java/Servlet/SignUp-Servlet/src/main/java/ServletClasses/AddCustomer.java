package ServletClasses;

import Model.Customer;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/sign")
public class AddCustomer implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");
        String email = servletRequest.getParameter("email");

        Customer coustomer = Customer.builder()
                .username(username)
                .password(password)
                .email(email)


                .build();

                ServiveControl serviveControl = new ServiceControl();





    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
