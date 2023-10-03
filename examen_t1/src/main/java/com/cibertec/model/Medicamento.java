package com.cibertec.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicamentos")
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idmedicamento;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion", columnDefinition = "TEXT")
	private String descripcion;

	@Column(name = "categoria")
	private String categoria;

	@Column(name = "precio")
	private BigDecimal precio;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechavencimiento;

	@Column(name = "stock")
	private Integer stock;

	@Column(name = "proveedor")
	private String proveedor;

	
	public Medicamento() {
		// TODO Auto-generated constructor stub
	}
	

	public int getIdMedicamento() {
		return idmedicamento;
	}

	public void setIdMedicamento(int idMedicamento) {
		this.idmedicamento = idMedicamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	
	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	

	public int getIdmedicamento() {
		return idmedicamento;
	}


	public void setIdmedicamento(int idmedicamento) {
		this.idmedicamento = idmedicamento;
	}


	public Date getFechavencimiento() {
		return fechavencimiento;
	}


	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}


	@Override
	public String toString() {
		return "Medicamento [idmedicamento=" + idmedicamento + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", categoria=" + categoria + ", precio=" + precio + ", fechavencimiento=" + fechavencimiento
				+ ", stock=" + stock + ", proveedor=" + proveedor + "]";
	}


	

}
