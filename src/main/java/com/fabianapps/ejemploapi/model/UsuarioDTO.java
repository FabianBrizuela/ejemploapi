package com.fabianapps.ejemploapi.model;

public class UsuarioDTO {

	private String nombre;
	private String apellido;
	private long nroDocumento;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public long getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(long nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
