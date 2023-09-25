package com.cibertec.modelo;

import java.util.Date;

public class ProductoViewModel {

	private Long idProducto;
	private String descripcion;
	private Double precio;
	private Integer cantidad;
	private Date fechaVencimiento;
	private String descripcionCategoria;
	
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getDescripcionCategoria() {
		return descripcionCategoria;
	}
	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descripcionCategoria = descripcionCategoria;
	}
	
	@Override
	public String toString() {
		return "ProductoViewModel [idProducto=" + idProducto + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", cantidad=" + cantidad + ", fechaVencimiento=" + fechaVencimiento + ", descripcionCategoria="
				+ descripcionCategoria + "]";
	}
	
	

}
