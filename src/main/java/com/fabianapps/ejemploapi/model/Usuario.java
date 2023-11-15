package com.fabianapps.ejemploapi.model;

public class Usuario {

	private String nombre;
	private String ci;
	
	
	
	public Usuario(String nombre, String ci) {
		super();
		this.nombre = nombre;
		this.ci = ci;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	
	
	
}
