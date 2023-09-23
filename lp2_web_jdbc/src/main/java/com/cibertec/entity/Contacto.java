package com.cibertec.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contactos")
public class Contacto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontactos")
	private int idcontactos;
	
	@Column(name="Nombres")
	private String nombre;
	
	@Column(name="Direccion")
	private String direccion;
	
	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contacto(int idcontactos, String nombre, String direccion) {
		super();
		this.idcontactos = idcontactos;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public int getIdcontactos() {
		return idcontactos;
	}

	public void setIdcontactos(int idcontactos) {
		this.idcontactos = idcontactos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Contacto [idcontactos=" + idcontactos + ", Nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
	
}
