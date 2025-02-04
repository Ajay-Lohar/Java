package servletClasses;

import controller.PlayerController;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import lombok.SneakyThrows;
import model.Players;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/allPlayers")
public class GetAllPlayersServlet implements Servlet{

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
        PlayerController playerController =new PlayerController();
        List<Players> allPlayers = playerController.getAllPlayers();
        PrintWriter writer = servletResponse.getWriter();
        writer.println(allPlayers);

    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
