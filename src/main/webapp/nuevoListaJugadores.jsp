<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
</head>

<html>
<body>

<c:if test="${not empty nombreJugador}">
	<h1> Hola ome ${ nombreJugador }</h1>
</c:if>
<c:if test="${empty nombreJugador }">
<h1> la ListaJugadores esta vacia</h1>
</c:if>

</body>
</html>

