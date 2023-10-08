package com.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Producto;
import com.cibertec.repository.IProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private IProductoRepository repos;
	
	public List<Producto> buscarPorDescripcion(String descripcion) {
		return repos.findByDescripcionContainingIgnoreCase(descripcion);
	}

}
