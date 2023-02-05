<!DOCTYPE html>
<html>
<% 	

// obtein the get value of my DB with the method getAttribute, of form dynamic//

String nombreJugador = (String) request.getAttribute("nombreJugador");

%>
<head>
<meta charset="ISO-8859-1">
</head>

<html>
<body><h1> Hola ome <%=nombreJugador %> </h1>
</body>
</html>

