package servletClasses;

import controller.PlayerController;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import lombok.SneakyThrows;
import model.Players;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

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
        String name = servletRequest.getParameter("name");
        String country = servletRequest.getParameter("country");
        String role = servletRequest.getParameter("role");
        int age =Integer.parseInt(servletRequest.getParameter("age"));
        int id =Integer.parseInt(servletRequest.getParameter("id"));

        Players player= Players.builder()
                .pid(id)
                .pname(name)
                .pcountry(country)
                .prole(role)
                .page(age)
                .build();

        PlayerController playerController = new PlayerController();
        playerController.addPlayer(player);


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
