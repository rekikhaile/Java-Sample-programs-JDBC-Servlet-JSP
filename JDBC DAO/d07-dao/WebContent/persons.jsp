<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/bootstrap.min.css">
<title>Persons</title>
</head>
<body>

<div class="table-responsive">
<table class="table table-hover table-bordered table-striped">
<caption>Persons</caption>
<thead>
	<tr>
		<th>ID</th>
		<th>FIRSTNAME</th>
		<th>LASTNAME</th>
	</tr>
</thead>
<tbody>
<c:forEach items="${persons}" var="person">
	<tr>
		<td><c:out value="${person.id}"/></td>
		<td><c:out value="${person.firstname}"/></td>
		<td><c:out value="${person.lastname}"/></td>
	</tr>
</c:forEach>
</tbody>
</table>
</div>

</body>
</html>