package by.matthewvirus.jdbcwebapp.servlets;

import by.matthewvirus.jdbcwebapp.mysql.business.UserDB;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DeleteServlet", value = "/delete")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            UserDB.delete(id);
            response.sendRedirect(request.getContextPath() + "/index");
        } catch (Exception e) {
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }
}