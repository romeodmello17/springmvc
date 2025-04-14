<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home page</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer rollno = (Integer) request.getAttribute("rollno");
	List<String> stocks = (List<String>) request.getAttribute("s");
	%>

	<h1>
		My name is
		<%=name%></h1>
	<h2>
		Roll No :
		<%=rollno%></h2>

	<h2>Investments</h2>
	<%
	for (String s : stocks) {
	%>
	<h1><%=s%></h1>
	<%
	}
	%>


</body>
</html>