package com.cibertec.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.modelo.Producto;
import com.cibertec.servicio.ProductoService;

@Controller
public class CarritoController {
	private List<Producto> carrito = new ArrayList<>();

	@Autowired
	private ProductoService productoService;

	@PostMapping("/addtochart")
	public String addToChart(@RequestParam("productoId") Integer productoId) {
		Producto producto = productoService.obtenerPorId(productoId);
		carrito.add(producto);

		return "redirect:/catalogo";
	}

	@GetMapping("/carrito")
	public String mostrarCarrito(Model model) {
		// Puedes pasar la lista de productos en el carrito al modelo
		model.addAttribute("productosEnCarrito", carrito);

		// También puedes calcular el monto total y pasarlo al modelo
		double montoTotal = carrito.stream().mapToDouble(Producto::getPrecio).sum();
		model.addAttribute("montoTotal", montoTotal);

		return "carrito";
	}
}
