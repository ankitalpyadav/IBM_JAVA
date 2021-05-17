<%@page import="com.ibm.entity.Flight"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Flight> flights = (List) request.getAttribute("flights");
	%>
	<h1>Welcome to Flight Booking</h1>
	<hr>
	<%if (!flights.isEmpty()) { %>
	<table>
		<tr>
			<th>Code</th>
			<th>From</th>
			<th>To</th>
			<th>Carrier</th>
		</tr>
		<%
		for (Flight f : flights) {
		%>
		<tr>
			<td><%=f.getCode()%></td>
			<td><%=f.getFrom()%></td>
			<td><%=f.getTo()%></td>
			<td><%=f.getCarrier()%></td>
		</tr>
		<%
		}
		%>

	</table><br>
	<% } 
	 else { %>
	<h3>No Flights found</h3>
	<%
		}
	%>
	<a href="home.jsp">Click to go back</a>
</body>
</html>