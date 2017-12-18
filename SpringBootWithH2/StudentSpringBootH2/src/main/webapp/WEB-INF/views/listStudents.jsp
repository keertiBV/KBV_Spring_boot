<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
<header>
	<c:import url="/WEB-INF/layouts/layout.jsp"/>
</header>

<h1>Welcome Boot!</h1>

<form method="get">
<table align="center" border="2" style="font-family: serif;">
<thead>
<tr align="center" style="font-weight:bold;font-size: medium;"> 
<td>First Name</td>
<td> Last Name</td>
<td> Gender</td>
<td>Email</td>
</tr></thead>
<c:forEach items="${studentList}" var="student">
<tr align="center" >
<td>${student.getFirstName()}</td>
<td>${student.getLastName()}</td>
<td>${student.getGender()}</td>
<td>${student.getEmail()}</td>
 </tr>
 </c:forEach>
</table>

</form>
</body>
</html>