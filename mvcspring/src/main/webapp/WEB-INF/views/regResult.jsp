<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Result</title>
</head>
<body>
User Registered Sucessfully. User Details are:
<%=request.getAttribute("user") %>
</body>
</html>