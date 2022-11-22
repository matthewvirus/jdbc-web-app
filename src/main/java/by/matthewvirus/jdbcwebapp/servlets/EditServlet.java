package by.matthewvirus.jdbcwebapp.servlets;

import by.matthewvirus.jdbcwebapp.mysql.business.User;
import by.matthewvirus.jdbcwebapp.mysql.business.UserDB;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "EditServlet", value = "/edit")
public class EditServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            User user = UserDB.selectUser(id);
            if (user != null) {
                request.setAttribute("user", user);
                getServletContext().getRequestDispatcher("/edit.jsp").forward(request, response);
            } else {
                getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage() + " " + e.getCause());
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            int age = Integer.parseInt(request.getParameter("age"));
            String gender = request.getParameter("gender");

            User user = new User(id, name, surname, age, gender);
            UserDB.update(user);

            response.sendRedirect(request.getContextPath() + "/index");
        } catch (Exception e) {
            System.err.println(e.getMessage() + " " + e.getCause());
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }
}