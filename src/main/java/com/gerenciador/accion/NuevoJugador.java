package com.gerenciador.accion;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.gerenciador.modulo.DB;
import com.gerenciador.modulo.Jugador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NuevoJugador {
	
	public void ejecutar (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		 
		String nombreJugador = request.getParameter("nombre");
		String paramFechaAdmision = request.getParameter("fecha");
		
		Date parametroFecha = null;
			
			 try {
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				parametroFecha =  sdf.parse(paramFechaAdmision);
			} catch (ParseException ExceptionParse) { 
				throw new ServletException(ExceptionParse);
			}
		
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>  Hola ome " + nombreJugador + "</h1></body></html>");
		
		Jugador jugadores = new Jugador();
		
		jugadores.setNombre(nombreJugador);
		jugadores.setfechaAdmision(parametroFecha);
		
		DB basedatos = DB.getInstancia();
		basedatos.agregarjugadores(jugadores);
		
		
		request.setAttribute("jugadores", jugadores.getNombre());
		response.sendRedirect("entrada?accion=listaJugadores");

}
}
