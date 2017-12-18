<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body background="#a3b4d1">
<header>
	<c:import url="/WEB-INF/layouts/layout.jsp"/>
</header>

<h1>Welcome ${firstName}</h1>

<form method="get">
<table align="center" border="2" style="font-family: serif;">
<thead>
<tr> 
<td>First Name</td>
<td> Last Name</td>
<td> Gender</td>
<td>Email</td>
</tr></thead>
<tr><td>${firstName}</td>
<td>${lastName}</td>
<td>${gender}</td>
<td>${email}</td></tr>
</table>

</form>
</body>
</html>