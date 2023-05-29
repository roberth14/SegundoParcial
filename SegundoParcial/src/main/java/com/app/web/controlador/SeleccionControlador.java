package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Seleccion;
import com.app.web.servicio.ContinenteServicio;
import com.app.web.servicio.SeleccionServicio;

@Controller
public class SeleccionControlador {
	
	@Autowired
	private SeleccionServicio servicio;
	
	
	@GetMapping({"/","seleccion"})
	public String listarSeleccion(Model modelo) {
		modelo.addAttribute("seleccseleccioniones", servicio.listarTodosLasSelecciones());
		return "seleccion";			
	}
	
	@GetMapping("/seleccion/nuevo")
	public String mostrarFormularioDeRegistrarSeleccion(Model modelo) {
		Seleccion seleccion = new Seleccion();
		modelo.addAttribute("seleccion",seleccion);
		return "crear_seleccion";
	}
	
	@PostMapping("/seleccion")
	public String guardarSeleccion(@ModelAttribute("seleccion") Seleccion seleccion) {
		servicio.guardarSeleccion(seleccion);
		return "redirect:/seleccion";
	}
	
	@GetMapping("/seleccion/editar/{id}")
	public String mostrarFormularioEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("seleccion", servicio.obterSeleccionPorI(id));
		return"editar_seleccion";
	}
	
	@PostMapping("/seleccion/{id}")
	public String actualizarSeleccion(@PathVariable Long id, @ModelAttribute ("seleccion") Seleccion seleccion, Model modelo) {
		Seleccion seleccionExistente = servicio.obterSeleccionPorI(id);
		seleccionExistente.setSerial(id);
		seleccionExistente.setNombre(seleccion.getNombre());
		seleccionExistente.setGrupo(seleccion.getGrupo());
		servicio.actualizarSeleccion(seleccionExistente);
		return "redirect:/seleccion";
	}
	
	@GetMapping("/seleccion/{id}")
	public String eliminarSeleccion(@PathVariable Long id) {
		servicio.eliminarSeleccion(id);
		return"redirect:/seleccion";
	}
	
}


