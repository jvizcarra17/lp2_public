package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.entity.Contacto;
import com.cibertec.repository.IContactoRepository;

@Controller
public class ProyectoController {
	
	@Autowired
	private IContactoRepository repos;
	
	@GetMapping("/")
    public String mostrarPaginaDeInicio() {
        return "index"; 
    }
	
	@GetMapping("/new")
	public String mostrarFormularioRegistro( Model model) {
		
		model.addAttribute("contacto", new Contacto());		
		return "new";
	}
	
	@PostMapping("/registro")
	public String guardarContacto(Contacto contacto)
	{
		repos.save(contacto);
		return "registro";
	}
	
	@GetMapping("/listado")
	public String listContactos(Model model) {
		List<Contacto> contactos = repos.findAll();
		model.addAttribute("contactos", contactos);
		return "listado";
	}
	
}
