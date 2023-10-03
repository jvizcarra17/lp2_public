package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.model.Medicamento;
import com.cibertec.repository.IRepositorioMedicamentos;

@Controller
public class MedicamentoController {
	
	@Autowired
	private IRepositorioMedicamentos repositorioMedicamentos; //Inyeccion de dependencias
	
	@GetMapping("/listado")
	public String listarMedicamentos(Model model) {
		List<Medicamento> medicamentos = repositorioMedicamentos.findAll();
		model.addAttribute("medicamentos", medicamentos);
		return "listado"; //nombre de la vista
	}
	
	@GetMapping("/nuevo")
	public String nuevoMedicamento(Model model) {
		model.addAttribute("medicamento", new Medicamento());
		return "nuevo"; //nombre de la vista
	}

	@PostMapping("/nuevo")
	public String formNuevoMedicamento(@ModelAttribute Medicamento medicamento) {
		repositorioMedicamentos.save(medicamento);
		return "redirect:/listado";
	}
	
}
