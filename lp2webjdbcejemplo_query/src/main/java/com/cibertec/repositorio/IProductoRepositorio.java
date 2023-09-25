package com.cibertec.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cibertec.modelo.Producto;

public interface IProductoRepositorio extends JpaRepository<Producto, Long> {
	
	@Query("SELECT p FROM Producto p LEFT JOIN FETCH p.categoria WHERE p.descripcion LIKE %:descripcion%")
	List<Producto> findByDescripcionContaining(@Param("descripcion") String descripcion);

}
