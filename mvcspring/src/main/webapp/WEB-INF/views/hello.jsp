<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>HELLO View</title>
</head>
<body>

	<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer salary = (Integer) request.getAttribute("salary");
	out.println("ID:" + id);
	out.println("Name:" + name);
	out.println("Salary:" + salary);
	%>
	
	<br /> ID:
	<b>${id}</b>
	 Name:
	<b>${name}</b>
	 Salary:
	<b>${salary}</b>
	

</body>
</html>