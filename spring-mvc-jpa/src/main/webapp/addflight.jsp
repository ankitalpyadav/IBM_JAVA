<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Booking</title>
</head>
<body>
<% String[] cities ={"Mumbai","Pune","Cochin","Goa","Kolkata","Bengaluru"}; %>
<h1>Welcome To Flight Booking</h1>
<hr>
	<form action="save.do" method="POST">
		<table border="">
		<tr>
			<td>Enter Code:</td>
			<td><input name="code"></td>
		</tr>
		<tr>
			<td>Enter Source:</td>
			<td><select name="from">
			<% for(String ct : cities){%>
				<option value="<%=ct %>"><%=ct %></option>
				<% } %>
			</select></td>
		</tr> 
		
		<tr>
			<td>Enter Destination:</td>
			<td><select name="to">
			<% for(String ct : cities){%>
				<option value="<%=ct %>"><%=ct %></option>
				<% } %>
			</select></td>
		</tr> 
		
		<tr>
			<td>Enter Carrier:</td>
			<td><input type="radio" name="carrier" value="Indigo">Indigo
				<input type="radio" name="carrier" value="JetAriways">JetAriways
				<input type="radio" name="carrier" value="AirIndia">AirIndia
			</td>
		</tr> 
			
		<tr>
			<th colspan="2"><input type="submit"></th>
		</tr>
			
		</table>
	</form>
</body>
</html>