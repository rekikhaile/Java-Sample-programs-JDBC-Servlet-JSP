<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="styles/common.css">
<title>Servlet Access date and time Java EE</title>
</head>
<body>

<div class="table-responsive">
<table class="table table-hover table-bordered table-striped">
<caption>Servlet Access</caption>
<thead>
	<tr>
		<th>#</th>
		<th>Date</th>
		<th>Time</th>
	</tr>
</thead>
<tbody>
<c:forEach items="${accesses}" var="accessi">
	<tr>
		<td><c:out value="${accessi.counter}"/></td>
		<td><c:out value="${accessi.date}"/></td>
		<td><c:out value="${accessi.time}"/></td>
	</tr>
</c:forEach>
</tbody>
</table>
</div>
<div id="contentbox">
<p><a href="AccessTimeServlet">AccessTimeServlet</a></p>
</div>
</body>
</html>