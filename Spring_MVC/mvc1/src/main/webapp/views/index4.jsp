<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Telusko Learning</title>
</head>
<body>
<center>
		<h1>Books Name coming from Books array</h1>
   		<c:forEach var="names" items="${books}">${names}</c:forEach>
</center>
</body>
</html>