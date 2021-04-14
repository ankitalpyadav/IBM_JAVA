<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Beautiful People</h1>
<h2>Welcome to Java Servlet Pages</h2>

<%! int counter = 2021; %>
<h3>Your visitor number: <%= ++counter %> </h3>
<% Date now = new Date(); %>
<h3>Log: <%= now %></h3>
</body>
</html>