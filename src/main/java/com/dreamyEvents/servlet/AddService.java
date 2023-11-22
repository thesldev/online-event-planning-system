package com.dreamyEvents.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dreamyEvents.Util.AddServiceDBManager;
import com.dreamyEvents.model.Services;


/**
 * Servlet implementation class AddService
 */
@WebServlet("/AddService")
public class AddService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		int uid = (int) session.getAttribute("id");

		String service_name = request.getParameter("service_name");
		String service_description = request.getParameter("service_description");
		Double service_price = Double.parseDouble(request.getParameter("service_price"));
		int contact_number = Integer.parseInt(request.getParameter("contact_number"));
		String contact_email = request.getParameter("contact_email");
		String service_type = request.getParameter("service_type");
		
		int sid = 0;
		Services services = new Services(service_name,service_description, service_price, contact_number, contact_email, service_type, uid, sid);         
		
		AddServiceDBManager asdbm = new AddServiceDBManager();
		
		String result = asdbm.insert(services,uid);
		
		/* navigate to login page */
		if(result.equals("SUCCESS")) {
		    
		    request.setAttribute("Add Service success", "true");
		    RequestDispatcher dispatcher = request.getRequestDispatcher("ActivatedServices.jsp");
		    dispatcher.forward(request, response);
		} else {
		    response.getWriter().print(result);
		}
	}

}
