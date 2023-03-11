package com.gerenciador.modulo;

public class IdJugadores {

	String nombre;
	String contrasena;
	
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
	
	public boolean esigual (String nombre, String contrasena) {
		if(! this.nombre.equals(nombre)){
		return false;}
		
		if(! this.contrasena.equals(contrasena)){
		return false;
		}
		
		return true;
	}
	
}
