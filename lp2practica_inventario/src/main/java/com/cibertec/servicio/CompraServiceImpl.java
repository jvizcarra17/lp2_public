package com.cibertec.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.modelo.Compra;
import com.cibertec.repositorio.ICompraRepository;

@Service
public class CompraServiceImpl implements CompraService {
	
	@Autowired
	private ICompraRepository compraRepository;


	@Override
	public List<Compra> obtenerTodas() {
		return compraRepository.findAll();
	}

	@Override
	public Compra obtenerPorId(Integer id) {
		return compraRepository.findById(id).orElse(null);
	}

	@Override
	public void guardarCompra(Compra compra) {
		 compraRepository.save(compra);

	}

}
