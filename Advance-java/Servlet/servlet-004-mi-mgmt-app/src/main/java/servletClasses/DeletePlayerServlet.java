package servletClasses;

import controller.PlayerController;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import lombok.SneakyThrows;
import model.Players;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/deleteplayer")
public class DeletePlayerServlet implements Servlet{

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @SneakyThrows
    @Override

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        int pidNumber = Integer.parseInt(servletRequest.getParameter("pidNumber"));
        PlayerController playerController =new PlayerController();
        playerController.deletePlayer(pidNumber);
        servletResponse.getWriter().println("Player Delete Successfully");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
