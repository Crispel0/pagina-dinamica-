package com.gerenciador.modulo;

import java.util.Date;

public class Jugador {

	private Integer id;
	private String nombre;
	private Date fechaAdmision = new Date();//Initialize a fechaAdmision each time that we're create a player//s
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getfechaAdmision() {
		return fechaAdmision;
	}
	public void setfechaAdmision(Date fechaAdmision) {
		this.fechaAdmision = fechaAdmision;
	}
	 
}
