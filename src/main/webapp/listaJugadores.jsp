<%@page import="java.util.List , com.gerenciador.servlet.Jugador"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>listaJugadores</title>
</head>
<body>

<ul>
	<!-- obtiene los valores de un jugador por su nombre y fecha de admision formateadas -->
	<c:forEach items="listaJugadores" var="jugador"> 
		<li> ${ jugador.nombre } ${ jugador.fechaadmision}</li>
	</c:forEach>
</ul>
</body>
</html>
