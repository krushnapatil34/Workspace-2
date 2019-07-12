<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.Regipojo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><h3>Edit Jsp Page<h3>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
<form action="edit">
<%Regipojo rg=(Regipojo)request.getAttribute("data"); %>
		id:-<input type="hidden" name="rd" value="<%=rg.getId()%>"> <br>
		name:-<input type="text" name="name" value="<%=rg.getName()%>"><br>
		email:-<input type="text" name="mailId" value="<%=rg.getMailId()%>"><br>
		username:-<input type="text" name="uname" value="<%=rg.getUname()%>"><br>
		password:-<input type="password" name="pw" value="<%=rg.getPw()%>"><br>
		<input type="radio" checked="checked" name="id"><br>
		<input type="submit" value="submit" value="<%=rg.getId()%>"> 
</form>
</body>
</html>