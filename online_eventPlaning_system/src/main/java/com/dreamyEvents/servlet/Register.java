package com.dreamyEvents.servlet;
 

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dreamyEvents.Util.RegisterManager;
import com.dreamyEvents.model.RSeller;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
	
		String user_name = request.getParameter("user_name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String firest_name = request.getParameter("firest_name");
		String last_name = request.getParameter("last_name");
		
		RSeller rseller=new RSeller(user_name, email, password, firest_name, last_name);
		
		RegisterManager rDao = new RegisterManager();
		
		String result = rDao.insert(rseller);
		
		/* navigate to login page */
		if(result.equals("SUCCESS")) {
		    // Registration successful, set attribute and redirect to login.jsp
		    request.setAttribute("registrationSuccess", "true");
		    RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		    dispatcher.forward(request, response);
		} else {
		    response.getWriter().print(result);
		}
		
	}

}
