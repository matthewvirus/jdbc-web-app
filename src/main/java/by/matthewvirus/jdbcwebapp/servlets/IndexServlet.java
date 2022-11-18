package by.matthewvirus.jdbcwebapp.servlets;

import by.matthewvirus.jdbcwebapp.mysql.business.User;
import by.matthewvirus.jdbcwebapp.mysql.business.UserDB;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "IndexServlet", value = "/index")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(@NotNull HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<User> users = UserDB.selectAllUsers();
        request.setAttribute("users", users);

        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}