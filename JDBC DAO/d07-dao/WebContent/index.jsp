<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java EE - Demo 07</title>
<link rel="stylesheet" type="text/css" href="styles/common.css">
</head>
<body>
<img src="images/hh_logo.jpg" alt="HAAGA-HELIA"/>
<h1>Java EE</h1>
<h2>DEMO 07</h2>

<div id="contentbox">
<h3>Content</h3>
<ul>
<li>DAO</li>
<li>properties-file</li>
<li>Singleton</li>
<li>JSTL for-each</li>
</ul>
<h3>Action</h3>
<p>Servlet uses DAO-class to fetch all persons from the database. DAO class reads the database connection settings from the properties-file and excecute the query. JSP page uses for-each tag from JSTL library to show query result.</p>
<h3>Link</h3>
<p><a href="findpersons.jsp">Find Persons</a></p>
</div>
</body>
</html>