package com.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gerenciador.accion.Accion;


/**
 * Servlet implementation class UnicaEntrada
 */
@WebServlet("/entrada")
public class UnicaEntrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String parametroAccion = request.getParameter("accion");
		
		/*
		 * Creo una claseModelo donde paso la ruta de ella mas su paquete ya que se
		 * compone de ello las clases
		 */
		
		String modeloClase = "com.gerenciador.accion" + parametroAccion;
		String nombre;
		try {
			/*
			 * Crea una instanciacion de la clase por la ruta que le pasemos en su parametro
			 * de URL y hace una instancia o new y retorna un Object
			 */
			Class clase;
			clase = Class.forName(modeloClase);
			Object obj = clase.newInstance();
			/*Convierto casteo Object<Generico> a especifico Accion para invocar su metodo Ejecutar*/
			Accion accion = (Accion) obj;
			 nombre = accion.ejecutar(request, response);
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {

			throw new ServletException(e);
		}
		
		
		String[] direccionyTipo = parametroAccion.split(":");
				
		if(direccionyTipo[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(direccionyTipo[1]);
			rd.forward(request, response);
		}else {
			
		response.sendRedirect(direccionyTipo[1]);
	}
}
}
