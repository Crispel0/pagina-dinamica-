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
	<!-- obtiene los valores de un jugador por su nombre y fecha de admision formateadas -->
	<c:forEach items="listaJugadores" var="jugador">
		<li> ${ jugador.nombre } ${jugador.fechaadmision}</li>
	</c:forEach>
	
</ul>
</body>
</html>
