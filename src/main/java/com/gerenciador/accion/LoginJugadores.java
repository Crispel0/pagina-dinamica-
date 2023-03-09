package com.gerenciador.accion;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginJugadores implements Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String paramNombre = request.getParameter("nombre");
		String paramContrasena = request.getParameter("contrasena");

		return "redirect:entrada?accion=listaJugadores";
	}

}
