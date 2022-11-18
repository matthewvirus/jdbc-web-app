package by.matthewvirus.jdbcwebapp.servlets;

import by.matthewvirus.jdbcwebapp.mysql.business.User;
import by.matthewvirus.jdbcwebapp.mysql.business.UserDB;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CreateServlet", value = "/create")
public class CreateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            int age = Integer.parseInt(request.getParameter("age"));
            String gender = request.getParameter("gender");

            User user = new User(name, surname, age, gender);
            UserDB.insert(user);

            response.sendRedirect(request.getContextPath() + "/index");
        } catch (Exception e) {
            getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
        }
    }
}