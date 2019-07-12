<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cjc.mvccrud.model.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><h3>Edit Jsp Page<h3>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
<form action="edit">
<%Student sd=(Student)request.getAttribute("data"); %>
		id:-<input type="hidden" name="rad" value="<%=sd.getId()%>"> <br>
		name:-<input type="text" name="name" value="<%=sd.getName()%>"><br>
		email:-<input type="text" name="mailId" value="<%=sd.getMailId()%>"><br>
		username:-<input type="text" name="uname" value="<%=sd.getUname()%>"><br>
		password:-<input type="password" name="pw" value="<%=sd.getPw()%>"><br>
		<input type="radio" checked="checked" name="id"><br>
		<input type="submit" value="submit" value="<%=sd.getId()%>"> 
</form>
</body>
</html>