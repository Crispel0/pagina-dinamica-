package com.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class jugadores
 */
public class jugadores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String nombreJugador = request.getParameter("nombre");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>  Hola ome " + nombreJugador + "</h1></body></html>");
		
		Jugador jugadores = new Jugador();
		
		jugadores.setNombre(nombreJugador);
		
		DB basedatos = new DB();
		basedatos.agregarjugadores(jugadores);

		
		RequestDispatcher rd = request.getRequestDispatcher("/nuevoListaJugadores.jsp");
		request.setAttribute("jugadores", jugadores);
		rd.forward(request, response);


}
