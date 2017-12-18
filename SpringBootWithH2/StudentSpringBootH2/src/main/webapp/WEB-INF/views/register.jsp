<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body background="#a3b4d1">
<header>
	<c:import url="/WEB-INF/layouts/layout.jsp"/>
</header>

<form method="post"  >
<table align="center"  border="0" style="font-family: serif;">
<caption><h1>Register here!</h1> <br/></caption>
<tr>
<td>First Name:</td>
<td><input type="text" name="firstName"/></td>
</tr>
<tr>
<td> Last Name:</td>
<td><input type="text" name="lastName"/></td></tr>
<tr>
<td> Gender:</td>
<td><select  id="gender" name="gender"> <option> select one</option>
<option>Male</option>
<option>Female</option>
</select></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="email" name="email"/></td></tr>
<tr><td>Password:</td>
<td><input type="password" name="password"/></td></tr>
<tr><td> <input type="submit" value="Submit"/></td>
<td><input type="reset" value="Reset"/></td>
</tr>
</table>

</form>
</body>
</html>