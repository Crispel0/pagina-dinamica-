<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/jugadores" var= "ListaJugadores"/>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>



<form action= " ${ListaJugadores} " method="post">

Jugador <input type="text" name="nombre" placeholder="Ingrese El Nombre De Un Jugador"/> 
FechaAdmision <input type="text" name="fecha" placeholder="Ingrese la fecha de admision del jugador">

<input type="submit"/>

</form>
</body>
</html>