<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/entrada" var= "listarJugadores"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<form action= "${listarJugadores}" method="post">
	
	Ingrese su Nombre: <input name="nombre"/>
	Ingrese Contraseña: <input name="contrasena" type="password"/>
	
	<input type="hidden" name="accion" value="LoginJugadores"/>
	<input type="submit"/>
	
</form>

</body>
</html>