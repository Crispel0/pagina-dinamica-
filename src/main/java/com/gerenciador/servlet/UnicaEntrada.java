package com.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

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
			System.out.println("listandoJugadores");
		} else if (accion.equals("eliminarJugadores")) {
			System.out.println("elminandoJugadores");
		} else if (accion.equals("modificarJugadores")) {
			System.out.println("modificandoJugadores");
		}

	}
}
