package com.cibertec.servicio;

import java.util.List;

import com.cibertec.modelo.Compra;

public interface CompraService {

	List<Compra> obtenerTodas();
	Compra obtenerPorId(Integer id);
	void guardarCompra(Compra compra);

}
