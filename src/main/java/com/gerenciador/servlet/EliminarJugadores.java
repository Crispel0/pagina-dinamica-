package com.gerenciador.servlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gerenciador.modulo.DB;

@WebServlet("/eliminarJugadores")
public class EliminarJugadores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		DB db = DB.getInstancia();
		db.eliminarJugadores(id);
		
		response.sendRedirect("ListaJugadores");
		
	}

}
