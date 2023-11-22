package com.dreamyEvents.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dreamyEvents.Util.logInDbManager;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();

        try {
            // Validate the email and password using the DBUtils class
            int id = logInDbManager.validate(email, password);
            
            if (id > 0) {
                // If the email and password are valid, create a session with the user's id
                session.setAttribute("id", id);

                // Redirect the user to the home page
                response.sendRedirect("seller_account_home.jsp");
            } else {
                // If the email and password are not valid, show an error message
                request.setAttribute("errorMessage", "Invalid email or password");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}
