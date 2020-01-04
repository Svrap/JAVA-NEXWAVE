package com.del.first.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;

import com.del.first.dao.UserDAO;
import com.del.first.entity.Users;


@WebServlet("/AuthenticateServlert")

public class AuthenticateServlert extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		String username=request.getParameter("uid");
		String password=request.getParameter("pwd");
//		Cookie c = new Cookie("username",username);
//		response.addCookie(c);
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		Users u = new Users(username,password);
		RequestDispatcher rd = null;
		PrintWriter out = response.getWriter();
		out.println("<h1><center>");
		if(new UserDAO().Validateuser(u))
		{
			//out.println("welcome  "+ username);
			rd = request.getRequestDispatcher("Services.html");
			 rd.include(request, response);;
		}
		else{
			out.println("Invalid Username/Password");
			 rd=request.getRequestDispatcher("Login.html"); 
			 rd.include(request, response);
			
		
		}
		out.println("</center></h1>");
	}

}
