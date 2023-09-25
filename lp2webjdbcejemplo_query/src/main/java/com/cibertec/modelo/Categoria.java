package com.cibertec.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcategoria")
	private Long idCategoria;

	private String descrip_cat;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	private List<Producto> productos;

	public Categoria(Long idCategoria, String descripcionCategoria, List<Producto> productos) {
		super();
		this.idCategoria = idCategoria;
		this.descrip_cat = descripcionCategoria;
		this.productos = productos;
	}

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescripcionCategoria() {
		return descrip_cat;
	}

	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descrip_cat = descripcionCategoria;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", descripcionCategoria=" + descrip_cat
				+ ", productos=" + productos + "]";
	}

	
}
