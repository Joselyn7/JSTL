package com.ecodeup.model;

import java.io.Serializable;

public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cui;
	private String nombres;
	private String apellidos;
	private int edad;

	
	public Empleado(String cui, String nombres, String apellidos, int edad) {
		super();
		this.cui = cui;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public String getCui() {
		return cui;
	}

	public void setCui(String cui) {
		this.cui = cui;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
