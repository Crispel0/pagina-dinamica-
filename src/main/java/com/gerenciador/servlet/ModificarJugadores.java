package com.gerenciador.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.gerenciador.servlet.DB;
import com.gerenciador.servlet.Jugador;

/**
 * Servlet implementation class ModificarJugadores
 */
@WebServlet("/modificarJugadores")
public class ModificarJugadores extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Jugador Registrado Exitosamente");
		
		/*Obtiene los tres valores de los jsp y los convierte String*/
		String nombreJugador = request.getParameter("nombre");
		String paramFechaAdmision = request.getParameter("fecha");
		String paramId = request.getParameter("id");
		
		/*Debo convertir ej id a Integer ya que en clase Jugador es Integer entonces se utiliza Integer
		 * puedo utilizar parseInt pero lo convertira en primitivo en nuestro caso es un objeto 
		 * */
		
			Integer id = Integer.valueOf(paramId);
	
		Date parametroFecha = null;
			
			 try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				parametroFecha =  sdf.parse(paramFechaAdmision);
			} catch (ParseException ExceptionParse) { 
				throw new ServletException(ExceptionParse);
			}
			 
		DB basedatos = DB.getInstancia();
		
		Jugador jugador = basedatos.buscarJugadorPorId(id);
		jugador.setNombre(nombreJugador);
		jugador.setfechaAdmision(parametroFecha);
		
		/*Redirecciona cuando es modificado todo*/
		response.sendRedirect("ListaJugadores");
		
	}

}
