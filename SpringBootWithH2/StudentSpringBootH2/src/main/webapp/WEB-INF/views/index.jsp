<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello JSP</title>
</head>
<body>
<header>
	<c:import url="/WEB-INF/layouts/layout.jsp"/>
</header>
<p>Hello ${name},</br>
Steven Paul Jobs (February 24, 1955 – October 5, 2011)
 was an American entrepreneur, business magnate, inventor, and industrial designer.
He was the chairman, chief executive officer (CEO), and co-founder of Apple Inc.;
 CEO and majority shareholder of Pixar; a member of The Walt Disney Company's board 
 of directors following its acquisition of Pixar; and the founder, chairman, and CEO of 
 NeXT. Jobs and Apple co-founder Steve Wozniak are widely recognized as pioneers of the
  microcomputer revolution of the 1970s and 1980s.</br>
He was born in San Francisco to parents who had to put him up for adoption at birth;
 he was raised in the San Francisco Bay Area during the 1960s. Jobs then attended 
 Reed College in 1972 before dropping out, and decided to travel through India in 
 1974 seeking enlightenment and studying Zen Buddhism. Jobs's declassified FBI report
  stated that an acquaintance knew that Jobs had used marijuana, and LSD while he was in
   college. Jobs once told a reporter that taking LSD was "one of the two or three
    most important things" he did in his life
</p>
</body>
</html>