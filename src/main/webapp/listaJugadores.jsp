<%@page import="java.util.List ,com.gerenciador.modulo.Jugador"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>listaJugadores</title>
</head>
<body>

	<ul>
		<!-- Show a message in the case that the the nombreJugador notis empty -->
		<c:if test=" ${not empty nombreJugador }" >
		<h1> Hola ome ${ nombreJugador }</h1>
		</c:if>
		
		<!-- obtiene los valores de un jugador por su nombre y fecha de admision formateadas -->
		<c:forEach items="${jugadores}" var="jugador">
			<li>${jugador.nombre}
			<fmt:formatDate value="${jugador.fechaAdmision}" pattern="dd/MM/yyyy" />
			</li>
			<!-- Es asignado por la ruta  del URL la especificacion del id -->
			<a href="/gerenciador/entrada?accion=eliminarJugadores&id=${jugador.id}">Eliminar</a>
			<a href="/gerenciador/entrada?accion=mostrarJugadores&id=${jugador.id}">modificar</a>
		</c:forEach>
	</ul>
</body>
</html>
