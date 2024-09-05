package com.tka.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
		System.out.println("U r in do get Method...");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String strUsername= request.getParameter("username");
		System.out.println("USername is  => "+strUsername);
		
		String strPass=request.getParameter("password");
		System.out.println("Password is  "+strPass);
		
		User user=new User();
		user.setUsername(strUsername);
		user.setPassword(strPass);
		
		MainDao dao=new MainDao();
		User userData= dao.login(user);
		System.out.println(userData);
		
		PrintWriter pw= response.getWriter();
		
		if(userData!=null) {
//			pw.print("U R Valid User");
//			pw.write("U R Valid User");
			
//			pw.write("<html><head><title>My Response</title></head><body>");
//			pw.write("<h2 style='color:green;'> Valid User</h2></body></html>");
			
//			RequestDispatcher rd= request.getRequestDispatcher("DashboardServlet");
//			rd.forward(request, response);
			
			response.sendRedirect("DashboardServlet");
			
			
		}else {
			//pw.print("U R InValid User");
//			pw.write("U R InValid User");
//			pw.write("<html><head><title>My Response</title></head><body>");
//			pw.write("<h2 style='color:red;'>Invalid Valid User</h2></body></html>");
			
			RequestDispatcher rd= request.getRequestDispatcher("login.html");
			pw.write("<h2 style='color:red;'> Invalid User</h2>");
			response.setContentType("text/html");
			rd.include(request, response);
			
		}
		
		
	}

}
