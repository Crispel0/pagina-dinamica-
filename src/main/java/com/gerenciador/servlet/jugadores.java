package com.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Servlet implementation class jugadores
 */
public class jugadores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		//obtiene los valores del jsp listaJugadoresform.jsp por medio de su valor value//
		String nombreJugador = request.getParameter("nombre");
		String paramFechaAdmision = request.getParameter("fecha");
		
		Date parametroFecha = null;
		
		try {
			//hace un parse o conversion de fechas con un pattern
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			 parametroFecha =  sdf.parse(nombreJugador);
		} catch (ParseException exceptionParse) { //en cualquier otro caso que haya un error al momento de parsear la fecha lanzar un ServletException//
			throw new ServletException(exceptionParse);
		}
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>  Hola ome " + nombreJugador + "</h1></body></html>");
		
		Jugador jugadores = new Jugador();
		
		jugadores.setNombre(nombreJugador);
		jugadores.setfechaAdmision(parametroFecha);
		
		DB basedatos = new DB();
		basedatos.agregarjugadores(jugadores);

		
		RequestDispatcher rd = request.getRequestDispatcher("/nuevoListaJugadores.jsp");
		request.setAttribute("jugadores", jugadores.getNombre());
		rd.forward(request, response);




	}

}
