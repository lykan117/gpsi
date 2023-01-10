package com.gapsi.examen.vo;

import java.io.Serializable;

public class Info implements Serializable{
	
private static final long serialVersionUID = 1L; 
	 
	private String id;
	private String nombre ;
	private String apellido;
	private String email;
	private String auto;
	private String modelo;
	private String vin;


	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAuto() {
		return auto;
	}

	public void setAuto(String auto) {
		this.auto = auto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", email=" + email + ", auto=" + auto + ", modelo=" + modelo+ ", vin=" + vin+ "]";
	}
}
