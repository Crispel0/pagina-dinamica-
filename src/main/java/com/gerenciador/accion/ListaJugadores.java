package com.gerenciador.accion;

import java.io.IOException;
import java.util.List;

import com.gerenciador.modulo.DB;
import com.gerenciador.modulo.Jugador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListaJugadores {

	public void ejecutar( HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {

		DB basedatos = DB.getInstancia();

		List<Jugador> listaJugadores = basedatos.getListaJugadores();

		request.setAttribute("jugadores", listaJugadores);
		RequestDispatcher rd = request.getRequestDispatcher("/listaJugadores.jsp");
		rd.forward(request, response);

	}
}

