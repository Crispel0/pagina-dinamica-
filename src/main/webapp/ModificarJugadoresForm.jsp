<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/modificarJugadores" var= "modificarJugadores"/>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>



<form action= "${modificarJugadores}" method="post">

Jugador <input type="text" name="nombre" placeholder="Ingrese El Nombre De Un Jugador" value="${jugador.nombre}" /> 
FechaAdmision 

<input type="text" name="fecha" placeholder="Ingrese la fecha de admision del jugador" value="<fmt:formatDate 
value="${jugador.fechaAdmision}" pattern="dd/MM/yyyy" />"/> 

<input type="hidden" name="id" value="${jugador.id}" /> 

<input type="submit"/>

</form>
</body>
</html>