package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.model.Producto;
import com.cibertec.services.ProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	ProductoService servicio;
	
	@GetMapping("/consultar")
	public String mostrarConsulta(Model model) {
		return "listaproductos";
	}
	
	@PostMapping("/consultar")
	public String buscarPorDescripcion(@RequestParam String descripcion,Model model) {
		List<Producto> productos = servicio.buscarPorDescripcion(descripcion);
		model.addAttribute("productos", productos);
		return "listaproductos"; //nombre de la vista
	}

}
