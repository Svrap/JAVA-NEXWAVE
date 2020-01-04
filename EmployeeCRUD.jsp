<%@page
	import="com.del.second.entity.Employee,com.del.second.dao.EmployeeDao,java.util.*"%>
<%
	Employee e = (Employee) request.getAttribute("emp");
	if (e == null)
		e = new Employee();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="EmpServlet" method=get>

		<table align=center width=50% bgcolor=lightblue>
			<tr>
				<th>Empid</th>
				<td><input type=text name=empid value=<%=e.getEmpid() %>></td>
			</tr>
			<tr>
				<th>Ename</th>
				<td><input type=text name=ename value=<%=e.getEname() %>></td>
			</tr>
			<tr>
				<th>Salary</th>
				<td><input type=text name=sal value=<%=e.getSalary() %>></td>
			</tr>
			<tr>
				<th>Date of join</th>
				<td><input type=date name=doj value=<%=e.getDoj() %>></td>
			</tr>
			<tr>

				<td><input type=submit name=sub value=Add></td>
				<td><input type=submit name=sub value=Delete></td>
				<td><input type=submit name=sub value=Modify></td>
				<td><input type=submit name=sub value=Search></td>
				<td><input type=submit name=sub value=ShowAll></td>

			</tr>

			
		</table>


	</form>

</body>
</html>