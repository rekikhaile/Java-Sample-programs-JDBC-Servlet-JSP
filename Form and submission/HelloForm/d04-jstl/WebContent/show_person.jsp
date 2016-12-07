<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter name</title>
<link rel="stylesheet" type="text/css" href="styles/common.css">
</head>
<body>
<h3>
<c:if test="${param.age < 18}">
This is not your site!
</c:if>
<c:if test="${param.gender=='Male' && param.age >= 18}">
Welcome Mr.
<c:out value="${person.firstname}"/>
<c:out value="${person.lastname}"/>!
</c:if>
<c:if test="${param.gender=='Female' && param.age >= 18}">
Welcome Mrs.
<c:out value="${person.firstname}"/>
<c:out value="${person.lastname}"/>!
</c:if>
</h3>
<p><a href="enter_data.jsp">Try again</a></p>
</body>
</html>