package com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class DB {

	
	private static List<Jugador> listaJugadores = new ArrayList<>();
	
	static {
		/*initialized the base of dates with information like a constructor*/
		
		Jugador jugador = new Jugador();
		jugador.setNombre("Ronaldinho");
		Jugador jugador2 = new Jugador();
		jugador2.setNombre("Di Marias");
		
		listaJugadores.add(jugador);
		listaJugadores.add(jugador2);
		
	}
	
	public void agregarjugadores(Jugador jugadores) {
		 listaJugadores.add(jugadores);
	}
	
	public List<Jugador> getListaJugadores(){
		return listaJugadores;
	}

	
}
