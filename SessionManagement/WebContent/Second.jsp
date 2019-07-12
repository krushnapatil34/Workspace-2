first:-<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Second page</title>
</head>

<body>
<form action="second">
<input type="text" name="t1" value="<%=session.getAttribute("fdata")%>"><br>
second:-<input type="text" name="t2"> <br> 
		
		<input type="submit" value="okay">
		</form>
</body>
</html>