package com.gerenciador.modulo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.gerenciador.accion.IdentificacionJugadores;

public class DB {

	private final List<Jugador> listaJugadores = new ArrayList<>();
	private final AtomicInteger llavesecuencial = new AtomicInteger(1);
	private final List<IdentificacionJugadores> listaIdJugadores = new ArrayList<>();
	private static DB instance = null;

	/* can't instanciate it */
	private DB() {

		Jugador jugador = new Jugador();
		jugador.setId(llavesecuencial.getAndIncrement());
		jugador.setNombre("Ronaldinho");

		Jugador jugador2 = new Jugador();

		jugador2.setId(llavesecuencial.getAndIncrement());
		jugador2.setNombre("Di Maria");

		IdentificacionJugadores jugadorIdentificacion= new IdentificacionJugadores();
		IdentificacionJugadores jugadorIdentificacion2 = new IdentificacionJugadores();

		jugadorIdentificacion.setNombre("crispelo");
		jugadorIdentificacion.setContrasena("12345");
				jugadorIdentificacion2.setNombre("crispelo");		jugadorIdentificacion2.setContrasena("6789");

		// add the id of each player instancied where we're pass the name and password//

		listaIdJugadores.add(jugadorIdentificacion);
		listaIdJugadores.add(jugadorIdentificacion2);

		// add the players in the ArrayList of players//
		listaJugadores.add(jugador);
		listaJugadores.add(jugador2);

	}

	/**
	 * cada vez que se crea un Jugador se añada a la lista y se asinga a la llave
	 * como comntador ID
	 */
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

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	/**
	 * mientras exista un jugador en la listaJugadores dame el siguiente guardalo en
	 * jugador y por ultimo si el id de ese jugador es igual a el id que me pasan
	 * por parametros elimina segun tu posicion actual de iterator de lo contario no
	 * haz nada
	 * 
	 * @param id
	 */
	public void eliminarJugadores(Integer id) {
		Iterator<Jugador> iterarJugador = listaJugadores.iterator();
		while (iterarJugador.hasNext()) {
			Jugador jugador = iterarJugador.next();
			if (jugador.getId() == id) {
				iterarJugador.remove();
			}

		}
	}

	/**
	 * recorre todos los jugadores en el caso de encontrar uno igual a el id por
	 * parametro automaticamente me retorna ese jugador del id de lo contrario no me
	 * retorna nada (si se desea puede retornarse una exception para mi no es
	 * necesario)
	 * 
	 * @param id
	 * @return
	 */
	public Jugador buscarJugadorPorId(Integer id) {
		for (Jugador jugador : listaJugadores) {
			if (jugador.getId() == id) {
				return jugador;
			}
		}
		return null;

	}

	/*
	 * Validate the user and password make a loop for each IdentificacionJugadores and return the IdentificacionJugadores when is have a password and a name equal of the
	 * contrary don't send nothing
	 */
	public IdentificacionJugadores validarJugador(String paramNombre, String paramContrasena) {
		for (IdentificacionJugadores identificarJugador : listaIdJugadores) {
			if (identificarJugador.esigual(paramNombre, paramContrasena)) {
				return identificarJugador;
			}
		}
		return null;
	}
}
