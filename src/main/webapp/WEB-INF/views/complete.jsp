<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Complete List</h1>
	
	<c:forEach var="c" items="${complete}">
		<li>${c.firstName } ${c.lastName} ${c.innovation} in ${c.year}</li>
		<p></p>
	</c:forEach>
	<p></p>
<button> <a href="/">Go to Tiny list</a></button>
</body>
</html>