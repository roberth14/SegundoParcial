package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Continente;
import com.app.web.servicio.ContinenteServicio;

@Controller
public class ContinenteControlador  {
	
	@Autowired
	private ContinenteServicio servicio;
	
	@GetMapping({"/","continentes"})
	public String listarContinentes(Model modelo) {
		modelo.addAttribute("continentes", servicio.listarTodosLosContinentes());
		return "continentes";			
	}
	
	@GetMapping("/continentes/nuevo")
	public String mostrarFormularioDeRegistrarContinente(Model modelo) {
		Continente continente = new Continente();
		modelo.addAttribute("continente",continente);
		return "crear_continente";
	}
	
	@PostMapping("/continentes")
	public String guardarContinente(@ModelAttribute("continentes") Continente continentes) {
		servicio.guardarContinente(continentes);
		return "redirect:/continentes";
	}
}

