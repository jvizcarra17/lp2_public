package com.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

	List<Producto> findByDescripcionContainingIgnoreCase(String descripcion);

}
