package com.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ListaJugadores")
public class ListaJugadores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/* make a for for each Jugador in the listaJugadores and print them
	 * hace un for por cada jugador en la listaJugadores y imprime ellas
	 * */
	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DB basedatos = DB.getInstancia();
		

		List<Jugador> listaJugadores = basedatos.getListaJugadores();
		

		request.setAttribute("jugadores", listaJugadores);
		RequestDispatcher rd = request.getRequestDispatcher("/listaJugadores.jsp");
		rd.forward(request, response);
		

	}
}
