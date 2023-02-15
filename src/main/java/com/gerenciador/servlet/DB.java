package com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DB {

	private static List<Jugador> listaJugadores = new ArrayList<>();
	private static Integer llavesecuencial = 1;
	
	static {
		/*initialized the base of dates with information like a constructor
		 * Y despues es asignado una llavepara el momento de crear un objeto Jugador 
		 */
		
		Jugador jugador = new Jugador();
		jugador.setId(DB.llavesecuencial);
		jugador.setNombre("Ronaldinho");
		Jugador jugador2 = new Jugador();
		jugador2.setId(DB.llavesecuencial);
		jugador2.setNombre("Di Maria");
		
		listaJugadores.add(jugador);
		listaJugadores.add(jugador2);
		
	}
	
	/**cada vez que se crea un Jugador se añada a la lista y se asinga a la llave como comntador ID*/
	public void agregarjugadores(Jugador jugadores) {
		 DB.listaJugadores.add(jugadores);
		 jugadores.setId(DB.llavesecuencial);
		 
	}
	
	public List<Jugador> getListaJugadores(){
		return DB.listaJugadores;
	}

	/**
	 * mientras exista un jugador en la listaJugadores
	 * dame el siguiente guardalo en jugador 
	 * y por ultimo si el id de ese jugador es igual a el id
	 * que me pasan por parametros elimina segun tu posicion actual de iterator de lo contario no haz nada
	 * @param id
	 */
	public void eliminarJugadores(Integer id) {
		Iterator<Jugador> iterarJugador = listaJugadores.iterator();
		while (iterarJugador.hasNext()) {
			Jugador jugador = iterarJugador.next();
			if(jugador.getId() == id) {
				iterarJugador.remove();
			}
			
		}
	}

	/**
	 * recorre todos los jugadores en el caso de encontrar uno igual a el id por parametro automaticamente 
	 * me retorna ese jugador del id de lo contrario no me retorna nada (si se desea puede retornarse una exception para
	 * mi no es necesario)
	 * @param id
	 * @return
	 */
	public Jugador buscarJugadorPorId(Integer id) {
		for (Jugador jugador : listaJugadores) {
			if(jugador.getId() == id) {
				return jugador;
			}
		}
		return null;
		
		
	}

	
}
