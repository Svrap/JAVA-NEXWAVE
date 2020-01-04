package com.del.second.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;


import com.del.second.dao.EmployeeDao;
import com.del.second.entity.Employee;


@WebServlet("/EmpServlet")

public class EmpServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		//		String empid=request.getParameter("empid");
		//		String empname=request.getParameter("ename");
		//		String  esal=request.getParameter("sal");
		//		String doj=request.getParameter("Doj");
		String submit = request.getParameter("sub");
		PrintWriter out = response.getWriter();
		Employee e = new Employee();
		EmployeeDao edao = new EmployeeDao();
		String message = "";
		e.setEmpid(Integer.parseInt(request.getParameter("empid")));
		RequestDispatcher rd = request.getRequestDispatcher("EmployeeCRUD.jsp");
		if(submit.equals("Add")||submit.equals("Modify"))
		{

			e.setEname(request.getParameter("ename"));
			e.setSalary(Double.parseDouble(request.getParameter("sal")));
			e.setDoj(Date.valueOf(request.getParameter("doj")));
			if(submit.equals("Add"))
			{
				edao.insertEmployee(e);
				message = message + "Inserted Record";
			}
			else
			{
				edao.modifyEmployee(e);
				message = message + "Modified Record";
			}
		}
		else if (submit.equals("Delete"))
		{

			if(edao.removeEmployee(e.getEmpid()))
				message = message + "Record Deleted";
			else
				message = "Deletion Failed";
		}
		else if(submit.equals("Search"))
		{
			e = edao.getEmployee(e.getEmpid());
			request.setAttribute("emp", e);
			//	rd = request.getRequestDispatcher("EmployeeCRUD.jsp");


		}
//		else if(submit.equals("ShowAll"))
//		{
//			ArrayList <Employee> e1  = edao.getEmployee();
//			request.setAttribute("emp", e1);
//		}

		out.print("<h1><center>"+message+"</center></h1>");
		rd.include(request,response);



	}
}
