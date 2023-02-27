package com.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gerenciador.accion.EliminarJugadores;
import com.gerenciador.accion.ListaJugadores;
import com.gerenciador.accion.ModificarJugadores;
import com.gerenciador.accion.MostrarJugadores;
import com.gerenciador.accion.NuevoJugador;

/**
 * Servlet implementation class UnicaEntrada
 */
@WebServlet("/entrada")/*Obtiene una referencia del parametro que le pasemos a la clase*/
/* Asigna a una clase Generica su metodo forname basicamente crea una clase y isIntance crea una instancia el new*/
public class UnicaEntrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String parametroAccion = request.getParameter("accion");
		/**
		 *   
		String nombreClase = "com.gerenciador.accion" + parametroAccion;
		 
		Class clase = Class.forName(nombreClase);
		clase.isInstance(clase);
		 * 
		 * 
		 */
		
		String redireccion = null;

		if (parametroAccion.equals("listaJugadores")) {

			ListaJugadores ListarJugadores = new ListaJugadores();
			redireccion = ListarJugadores.ejecutar(request, response);

		} else if (parametroAccion.equals("mostrarJugadores")) {

			MostrarJugadores mostrarJugadores = new MostrarJugadores();
			redireccion = mostrarJugadores.ejecutar(request, response);

		} else if (parametroAccion.equals("eliminarJugadores")) {

			EliminarJugadores eliminarJugadores = new EliminarJugadores();
			redireccion = eliminarJugadores.ejecutar(request, response);

		} else if (parametroAccion.equals("modificarJugadores")) {
			ModificarJugadores modificarJugadores = new ModificarJugadores();
			redireccion  = modificarJugadores.ejecutar(request, response);
		}

		else if (parametroAccion.equals("nuevoJugador")) {
			NuevoJugador nuevojugador = new NuevoJugador();
			redireccion = nuevojugador.ejecutar(request, response);
		}
		else if(parametroAccion.equals("nuevoJugadorForm")) {
			NuevoJugadorForm nuevoJugadorForm = new NuevoJugadorForm();
			redireccion = nuevoJugadorForm.ejecutar(request, response);
		}
		
		/*
		 * Toma el retorno de cada referencia de una clase y divide la String por : guardandola en un array
		 * de Strings 
		 */
		String[] direccionyTipo = redireccion.split(":");
		
		/*si el arr de String es == a forward en la posicion 0 envialo por un RequestDistpatcher*/
		if(direccionyTipo[0].equals("forward")) {
		RequestDispatcher rd = request.getRequestDispatcher(direccionyTipo[1]);
		rd.forward(request, response);}
		else{ /* De lo contrario solo envialo por un redirect por la segunda posicion del arr*/
			response.sendRedirect(direccionyTipo[1]);
		}
		
		

	}

}
