package com.dreamyEvents.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dreamyEvents.Util.DeleteServiceManager;

@WebServlet("/DeleteService")
public class DeleteService extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the service ID from the form data
        int sid = Integer.parseInt(request.getParameter("sid"));

        // Delete the service using the DeleteServiceManager
        DeleteServiceManager serviceManager = new DeleteServiceManager();
        boolean deleted = serviceManager.deleteService(sid);

        if (deleted) {
            // Redirect to the ActivatedServices.jsp page on successful deletion
            response.sendRedirect("ActivatedServices.jsp");
        } else {
            // Handle error if the service was not deleted
            // You can display an error message or redirect to an error page
            response.getWriter().println("Error: Service deletion failed.");
        }
    }
}
