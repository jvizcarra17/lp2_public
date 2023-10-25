package com.cibertec.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cibertec.modelo.Compra;
import com.cibertec.servicio.CompraService;

@Controller
public class CompraController {

	@Autowired
	private CompraService compraService;

	@GetMapping("/showcarrito")
	public String mostrarCarrito(Model model) {
		model.addAttribute("compras", compraService.obtenerTodas());
		return "carrito";
	}

	@GetMapping("/resumen")
	public String mostrarResumenCompra(Model model) {
		List<Compra> compras = compraService.obtenerTodas();

		// Lógica para calcular el total de todas las compras
		double totalCompra = calcularTotalCompra(compras);

		model.addAttribute("compras", compras);
		model.addAttribute("totalCompra", totalCompra);

		return "resumen";
	}

	private double calcularTotalCompra(List<Compra> compras) {
		double total = 0.0;
		for (Compra compra : compras) {
			total += compra.getTotal();
		}
		return total;
	}

}
