package com.gerenciador.accion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.gerenciador.modulo.DB;
import com.gerenciador.modulo.Jugador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MostrarJugadores {

public void ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
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
