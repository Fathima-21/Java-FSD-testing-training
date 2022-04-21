<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.ust.spring.mvcspring.dto.Employee,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employeelist");
	for (Employee e : employees) {
		out.println(e.getId());
		out.println(e.getName());
		out.println(e.getSalary());
	}
	%>

</body>
</html>