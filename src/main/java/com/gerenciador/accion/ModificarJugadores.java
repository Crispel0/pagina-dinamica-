package com.gerenciador.accion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.gerenciador.modulo.DB;
import com.gerenciador.modulo.Jugador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ModificarJugadores {

	public void ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombreJugador = request.getParameter("nombre");
		String paramFechaAdmision = request.getParameter("fecha");
		String paramId = request.getParameter("id");
		

		Integer id = Integer.valueOf(paramId);
		
		System.out.println("Modificando Jugador" + id);

		Date parametroFecha = null;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			parametroFecha = sdf.parse(paramFechaAdmision);
		} catch (ParseException ExceptionParse) {
			throw new ServletException(ExceptionParse);
		}

		DB basedatos = DB.getInstancia();

		Jugador jugador = basedatos.buscarJugadorPorId(id);
		jugador.setNombre(nombreJugador);
		jugador.setfechaAdmision(parametroFecha);

		response.sendRedirect("entrada?accion=ListaJugadores");

	}

}
