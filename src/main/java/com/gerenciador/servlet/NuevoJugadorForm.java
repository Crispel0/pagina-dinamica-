package com.gerenciador.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NuevoJugadorForm {
	
	public String ejecutar (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		return "forward:listaJugadoresform.jsp";
	}

}
