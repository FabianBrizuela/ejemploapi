package com.fabianapps.ejemploapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nombre;
	private String apellido;
	private long nroDocumento;
	private int edad;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
