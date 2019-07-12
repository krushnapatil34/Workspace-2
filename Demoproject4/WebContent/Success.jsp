<%@page import="com.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<%=request.getAttribute("msg") %>
<%Student stu =(Student)request.getAttribute("data"); %>
id:-<%=stu.getId() %>
<br>
user name:-<%=stu.getUname()%>
<br>
Password:-<%=stu.getPw() %>
</body>
</html>