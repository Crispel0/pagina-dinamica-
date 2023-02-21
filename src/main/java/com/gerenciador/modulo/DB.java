package com.gerenciador.modulo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DB {

	private final List<Jugador> listaJugadores = new ArrayList<>();
	private final AtomicInteger llavesecuencial = new AtomicInteger(1);
	private static DB instance = null;
	
	/*can't instanciate it*/
	private DB () {
		
		
		Jugador jugador = new Jugador();
		jugador.setId(llavesecuencial.getAndIncrement());
		jugador.setNombre("Ronaldinho");
		Jugador jugador2 = new Jugador();
		jugador2.setId(llavesecuencial.getAndIncrement());
		jugador2.setNombre("Di Maria");
		
		listaJugadores.add(jugador);
		listaJugadores.add(jugador2);
		
	}
	
	/**cada vez que se crea un Jugador se añada a la lista y se asinga a la llave como comntador ID*/
	public void agregarjugadores(Jugador jugadores) {
		 listaJugadores.add(jugadores);
		 jugadores.setId(llavesecuencial.getAndIncrement());
		 
	}
	
	  public static DB getInstancia() {
	        if (instance == null) {
	            instance = new DB();
	        }
	        return instance;
	    }
	
	public List<Jugador> getListaJugadores(){
		return listaJugadores;
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
