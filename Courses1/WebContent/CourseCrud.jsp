<%@ page import="com.del.course.entity.Courses, com.del.course.dao.CourseDAO" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	Courses c = (Courses)request.getAttribute("cor");
	if(c==null) c = new Courses();
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CourseCrudServlet" method=get>
	<table  bgcolor=lightblue style="color:Black;" >
			<tr>
				<th>Course Id</th>
				<td><input type=text name=course_id value=<%=c.getCourse_id()  %> placeholder="ID"></td>
			</tr>
			<tr>
				<th>Course Name</th>
				<td><input type="text" name=course_name value=<%=c.getCourse_name() %> placeholder="name"></td>
			</tr>
			<tr>
				<th>Course Duration</th>
				<td><input type="text" name=course_duration value=<%=c.getCourse_duration() %> placeholder="Duration in months"></td>
			</tr>
			<tr>
				<th>Course Fee</th>
				<td><input type="text" name=course_fee value=<%=c.getCourse_fee() %> placeholder="Fee"></td>
			</tr>
			<tr>
				<td><input type=submit value=Add name="sub"></td><br>
				
				<td><input type=submit value=Remove name="sub"></td><br>
				</tr>
				<tr>
				<td><input type=submit value=Modify name="sub"></td><br>
				<td><input type=submit value=Search name="sub"></td>
			</tr>
		</table>
</form>

</body>
</html>