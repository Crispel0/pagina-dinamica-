package com.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class ListaJugadores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/* make a for for each Jugador in the listaJugadores and print them
	 * hace un for por cada jugador en la listaJugadores y imprime ellas
	 * */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DB basedatos = new DB();
		

		List<Jugador> listaJugadores = basedatos.getListaJugadores();
		

		request.setAttribute("jugadores", listaJugadores);
		RequestDispatcher rd = request.getRequestDispatcher("/listaJugadores.jsp");
		rd.forward(request, response);
		

	}
}
