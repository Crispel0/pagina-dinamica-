package com.gerenciador.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModificarEmpresa
 */
@WebServlet("/modificarEmpresa")
public class ModificarJugadores extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String paramId = request.getParameter("id");
			Integer id = Integer.valueOf(paramId);
			
			DB basedatos = new DB();
			
			Jugador jugador = basedatos.buscarJugadorPorId(id);
		}
}
