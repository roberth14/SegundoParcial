package co.com.app.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.app.web.entities.Continente;
import co.com.app.web.repository.IContinenteRepository;



@RestController
@RequestMapping("/continentes")
@CrossOrigin
public class ContinenteController {
	
	@Autowired
	IContinenteRepository continenteRepository;
	
	@GetMapping
	public List<Continente>listar(){
		return continenteRepository.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Optional<Continente>findContieneById(@PathVariable Integer id ){
		Optional<Continente> continente=continenteRepository.findById(id);
		if(continente.isPresent()) {
			return continente;
		}
		return null;
	}
	
	@PostMapping
	public Continente postContinente(@RequestBody Continente continente) {
		continenteRepository.save(continente);
		return continente;
	}
	@PutMapping("/{id}")
	public Continente putContinente(@PathVariable Integer id,@RequestBody Continente continente) {
		Optional<Continente>continenteCurrent=continenteRepository.findById(id);
		if(continenteCurrent.isPresent()) {
			Continente continenteReturn=continenteCurrent.get();
			continenteReturn.setNombre(continente.getNombre());
			continenteRepository.save(continenteReturn);
		}
		return null;
	}
	@DeleteMapping("/{id}")
	public Continente deleteContinente(@PathVariable Integer id) {
		Optional<Continente>continente=continenteRepository.findById(id);
		if(continente.isPresent()) {
			continenteRepository.deleteById(id);
			return continente.get();
		}
		return null;
	}
	
	

}
