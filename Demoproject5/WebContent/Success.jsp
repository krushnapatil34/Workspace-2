<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><h1>welcome to success page</h1>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success page</title>
</head>
<body>
<jsp:useBean id="data" class="com.Student" scope="request"/>

id:-<jsp:setProperty name="data" property="id"/>
<br>
 uname:-<jsp:setProperty name="data" property="uname"/>
 <br>
 pw:-<jsp:setProperty property="pw" name="data"/>
 
 
id:-<jsp:getProperty name="data" property="id"/>
<br>
 uname:-<jsp:getProperty name="data" property="uname"/>
 <br>
 pw:-<jsp:getProperty property="pw" name="data"/>
</body>
</html>