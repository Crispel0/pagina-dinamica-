package com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class DB {

	private static List<Jugador> listaJugadores = new ArrayList<>();
	
	private void agregarjugadores(Jugador jugadores) {
		 listaJugadores.add(jugadores);
	}
	
	private List<Jugador> getListaJugadores(){
		return listaJugadores;
	}

	
}
