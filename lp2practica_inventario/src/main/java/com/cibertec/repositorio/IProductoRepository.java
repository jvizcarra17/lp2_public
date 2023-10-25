package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.modelo.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
