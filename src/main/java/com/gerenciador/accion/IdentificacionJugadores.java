package com.gerenciador.accion;

public class IdentificacionJugadores {
	
	private String nombre;
	private String contrasena;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	//if the name is equal to the password so is true of contrary is false//
	public boolean esigual(String nombre, String contrasena) {
		if(!this.nombre.equals(contrasena)){
			return false;
		}
		if(!this.contrasena.equals(contrasena)) {
			return false;
		}
		else 
			return true;
	}
	
	

}
