package com.cibertec.servicio;

import java.util.List;

import com.cibertec.modelo.Producto;

public interface ProductoService {
	
	 List<Producto> obtenerTodos();
	 Producto obtenerPorId(Integer id);
	 void guardarProducto(Producto producto);

}
