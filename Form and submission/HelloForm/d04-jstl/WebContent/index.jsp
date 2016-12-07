<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java EE - Demo 04</title>
<link rel="stylesheet" type="text/css" href="styles/common.css">
</head>
<body>
<img src="images/hh_logo.jpg" alt="HAAGA-HELIA"/>
<h1>Java EE</h1>
<h2>Extended Hello Form</h2>

<div id="contentbox">
<h3>Content</h3>
<ul>
<li>Request attribute</li>
<li>Request dispatcher forward</li>
<li>Libraries</li>
<li>JSTL (JavaServer Pages Standard Tag Library)</li>
<li>HTTP request method POST</li>
<li>Escape XML (prevent XSS)</li>
</ul>
<h3>Action</h3>
<p>Enter firstname, lastname, gender and age which will be sent to servlet. Servlet package parameters to object and save it to request attribute. JSP page will print out entered name with welcome if age is over 18. If it is under 18 it tells that the site is not for them.</p>
<h3>Link</h3>
<p><a href="enter_data.jsp">enter_data.jsp</a></p>
</div>
</body>
</html>