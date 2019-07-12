  <%@page import="javax.persistence.Table"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.Regipojo"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1>welcome to success Page</h1>
<script type="text/javascript">
function del() {
	alert("delete this data from table and database")
	document.f.action="delete";
	document.f.submit();
	
}
function add() {
	alert("Add this data to table and database")
	document.f.action="Registration.jsp";
	document.f.submit();	
}

function ed() {
	alert("edit this data to table and database")
	document.f.action="ed";
	document.f.submit();
	
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success page</title>
</head>
<body>
	<form name="f">
		<table border="2" style="width: 100%;">
			<tr>
				<th>select</th>
				<th>id</th>
				<th>username</th>
				<th>password</th>

				<%
					List<Regipojo> list = (List<Regipojo>) request.getAttribute("data");

					for (Regipojo stu : list)

					{
				%>
			
			<tr>
				<td><input type="radio" name="rad" value=<%=stu.getId()%>>
				<td>id:-<%=stu.getId()%></td>
				<td>uname:-<%=stu.getUname()%></td>
				<td>pw:-:-<%=stu.getPw()%></td>
			</tr>


			<%
				}
			%>

		</table>
		<center>
			<input type="button" value="delete" onclick="del()">
			<input type="button" value="add" onclick="add()">
			<input type="button" value="Edit" onclick="ed()">
		</center> 

	</form>
</body>
</html>