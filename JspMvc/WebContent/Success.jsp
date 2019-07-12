<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="com.Student" %>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to success Page</title>
</head>
<body>
 <%=request.getAttribute("msg") %> 

<c:forEach items="${data}" var="s">
<c:out value="${s.id }" ></c:out>
<br>
<c:out value="${s.uname }"></c:out>
<br>
<c:out value="${s.pw }" ></c:out>

<table border="2">
<tr>
<th>id</th>
<th>uname</th>
<th>pw</th>
</tr>
<tr>
<td>${s.id}</td>
<td>${s.uname}</td>
<td>${s.pw}</td>
</tr>
</c:forEach>
</table>
</body>
</html>