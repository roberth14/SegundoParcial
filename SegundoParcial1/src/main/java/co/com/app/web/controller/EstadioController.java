package co.com.app.web.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.app.web.entities.Estadio;
import co.com.app.web.repository.IEstadioRepository;



@RestController
@RequestMapping("/estadios")
@CrossOrigin
public class EstadioController {
	
	@Autowired
	IEstadioRepository estadioRepository;
	
	@GetMapping("/{id}")
	public Optional<Estadio> finEstadioById(@PathVariable Integer id){
		Optional<Estadio> estadio=estadioRepository.findById(id);
		if(estadio.isPresent()) {
			return estadio;
		}
		return null;
	}

}
