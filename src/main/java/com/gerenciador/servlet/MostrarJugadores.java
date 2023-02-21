package com.gerenciador.servlet;

import java.io.IOException;

import com.gerenciador.modulo.DB;
import com.gerenciador.modulo.Jugador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModificarEmpresa
 */
@WebServlet("/mostrarJugadores")
public class MostrarJugadores extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String paramId = request.getParameter("id");
			/*Convierte el valor de String a Integer uso valueof en vez de parseInt porque 
			 * parseInt me lo convierte a primitivo no a objeto
			 */
			Integer id = Integer.valueOf(paramId);
			
			
			DB basedatos = DB.getInstancia();
			
			Jugador jugador = basedatos.buscarJugadorPorId(id);
			
			request.setAttribute("jugador", jugador);
			
			RequestDispatcher rd = request.getRequestDispatcher("/ModificarJugadoresForm.jsp");
			rd.forward(request, response);
			
		}
}
