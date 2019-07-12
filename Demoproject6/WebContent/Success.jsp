<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.Student" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success page</title>
</head>
<body>
<% 
List<Student>list=(List<Student>)request.getAttribute("data");
for(Student stu: list)
{
	%>
id:-<%=stu.getId() %>
<Br>
 uname:-<%=stu.getUname() %>
 <br>
 pw:-:-<%=stu.getPw() %>
 <%
 
}
%>

</body>
</html>