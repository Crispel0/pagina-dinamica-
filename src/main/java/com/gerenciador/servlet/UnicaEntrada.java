package com.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gerenciador.accion.EliminarJugadores;
import com.gerenciador.accion.ListaJugadores;
import com.gerenciador.accion.ModificarJugadores;

/**
 * Servlet implementation class UnicaEntrada
 */
@WebServlet("/entrada")
public class UnicaEntrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String accion = request.getParameter("accion");

		if (accion.equals("listaJugadores")) {

		ListaJugadores ListarJugadores = new ListaJugadores();
		
		ListarJugadores.listar(request, response);
		
		} else if (accion.equals("eliminarJugadores")) {

			EliminarJugadores.eliminar(request, response);
			
		} else if (accion.equals("modificarJugadores")) {
			ModificarJugadores modificarJugadores = new ModificarJugadores();
			modificarJugadores.modificar(request, response);
		}

	}
}
