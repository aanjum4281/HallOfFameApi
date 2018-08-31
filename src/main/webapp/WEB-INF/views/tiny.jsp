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

	<h1>Tiny List</h1>
	
	<c:forEach var="t" items="${tiny}">
	
		<li> ${t.name} invented ${t.invented } in ${t.year} </li>
		
		<p> </p>
	</c:forEach>
	
	<p> </p>
	<button><a href="/complete">Complete List</a></button>
</body>
</html>