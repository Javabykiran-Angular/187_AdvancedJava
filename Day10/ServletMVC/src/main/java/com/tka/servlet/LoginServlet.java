package com.tka.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.tka.dao.MainDao;
import com.tka.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		// TODO Auto-generated method stub
		
		String strUsername= request.getParameter("username");
		String strPassword= request.getParameter("password");
		System.out.println("Username:: "+strUsername);
		System.out.println("Password:: "+strPassword);
		
		User user=new User();
		user.setUsername(strUsername);
		user.setPassword(strPassword);
		
		MainDao dao=new MainDao();
		User u= dao.login(user);
		PrintWriter pw= response.getWriter();
		
		if(u!=null) {
			System.out.println("Valid user..");
//			RequestDispatcher rd= request.getRequestDispatcher("DashboardServlet");
//			rd.forward(request, response);
			
			HttpSession session= request.getSession();
			session.setAttribute("myusername",u.getUsername() );
			response.sendRedirect("DashboardServlet");
		}else {
			System.out.println("InValid user..");
			RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
			pw.write("<h2>Invalid User</h2>");
			response.setContentType("text/html");
			rd.include(request, response);
		}
		
		
		
		
	}

}
