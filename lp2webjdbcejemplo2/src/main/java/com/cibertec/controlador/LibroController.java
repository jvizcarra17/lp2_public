package com.cibertec.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.modelo.Libro;
import com.cibertec.repositorio.ILibroRepositorio;

@Controller
@RequestMapping("/libros")
public class LibroController {

	@Autowired
	private ILibroRepositorio libroRepositorio; // Inyeccion de dependencias

	@GetMapping("/")
	public String listarLibros(Model model) {
		List<Libro> libros = libroRepositorio.findAll();
		model.addAttribute("libros", libros);
		return "listarlibros"; // nombre de la vista
	}

	@GetMapping("/nuevo")
	public String nuevoLibro(Model model) {
		model.addAttribute("libro", new Libro());
		return "nuevo"; // nombre de la vista
	}

	@PostMapping("/guardar")
	public String guardarlibro(@ModelAttribute Libro libro) {
		libroRepositorio.save(libro);
		return "redirect:/libros/"; // redirecciona para ver la lista
	}

	@GetMapping("/editar/{id}")
	public String editarLibro(@PathVariable Integer id, Model model) {
		Libro libro = libroRepositorio.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("ID de libro no válido"));
		model.addAttribute("libro", libro);
		return "editalibro"; // Vista de edición
	}

	@GetMapping("/eliminar/{id}")
	public String eliminarLibro(@PathVariable Integer id) {
		libroRepositorio.deleteById(id);
		return "redirect:/libros/";
	}
	
	
}
