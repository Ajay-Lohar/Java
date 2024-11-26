package servletClasses;

import controller.PlayerController;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import lombok.SneakyThrows;
import model.Players;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addPlayer.java")
public class AddPlayerServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("AddPlayers:init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @SneakyThrows
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("AddPlayerServlet:Service");
        String pname = servletRequest.getParameter("name");
        String pcountry = servletRequest.getParameter("country");
        String prole = servletRequest.getParameter("role");
        int page =Integer.parseInt(servletRequest.getParameter("age"));

        Players players= Players.builder()
                .pname(pname)
                .pcountry(pcountry)
                .prole(prole)
                .page(page)
                .build();
        PlayerController playerController = new PlayerController();
        playerController.addPlayer(players);

        PrintWriter writer = servletResponse.getWriter();
        writer.println("Player Added Successfully");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("AddPlayerServlet:Destroy");
    }
}
