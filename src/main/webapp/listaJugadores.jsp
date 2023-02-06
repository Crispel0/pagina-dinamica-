<%@page import="java.util.List , com.gerenciador.servlet.Jugador"s%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<ul>
	<%
	List<Jugador> listajugadores = (List<Jugador>) request.getAttribute("ListaJugadores");
		for(Jugador jugador : listajugadores){
	%>
	
	<li> <%= (jugador.getNombre() %></li>

	<%
		} 
	%>
	</ul>
</body>
</html>