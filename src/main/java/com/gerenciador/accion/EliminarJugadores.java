package com.gerenciador.accion;

import java.io.IOException;

import com.gerenciador.modulo.DB;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EliminarJugadores {

	public static void ejecutar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		DB db = DB.getInstancia();
		
		db.eliminarJugadores(id);
		System.out.println("Eliminado Jugador" + id);
		
		response.sendRedirect("entrada?accion=listaJugadores");

		
	}

}

