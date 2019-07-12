<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="DemoProject3.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success JSP Page</title>
</head>
<body>
	<%Student s=(Student)response.getAttribute("Student")%>
	<%=s.getRollno()%>
	<%=s.getName()%>
	<%=s.getMobnumber()%>
	<%=s.getAge()%>
	<%=s.getAddress()%>
</body>
</html>