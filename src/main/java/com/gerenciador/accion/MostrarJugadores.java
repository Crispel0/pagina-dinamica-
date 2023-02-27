package com.gerenciador.accion;

import java.io.IOException;


import com.gerenciador.modulo.DB;
import com.gerenciador.modulo.Jugador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MostrarJugadores {

public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String paramId = request.getParameter("id");
	/*Convierte el valor de String a Integer uso valueof en vez de parseInt porque 
	 * parseInt me lo convierte a primitivo no a objeto
	 */
	Integer id = Integer.valueOf(paramId);
	
	
	DB basedatos = DB.getInstancia();
	
	Jugador jugador = basedatos.buscarJugadorPorId(id);
	
	request.setAttribute("jugador", jugador);
	
	return "forward:ModificarJugadoresForm.jsp";
	
}
}
