<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Third page</title>
</head>
<body>
<form action="third">
		first:-<input  name="t1" value="<%=session.getAttribute("fdata")%>"><br>
		second:-<input name="t2" value="<%=session.getAttribute("sdata")%>"><br>
	third:-<input type="text" name="t3"> <br>

	<input type="submit" value="okay">
		</form>
</body>
</html>