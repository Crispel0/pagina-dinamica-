package com.gerenciador.accion;

import java.io.IOException;

import com.gerenciador.modulo.DB;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EliminarJugadores implements Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		DB db = DB.getInstancia();
		
		db.eliminarJugadores(id);
		System.out.println("Eliminado Jugador" + id);
		
		return "redirect:entrada?accion=listaJugadores";

		
	}

}

