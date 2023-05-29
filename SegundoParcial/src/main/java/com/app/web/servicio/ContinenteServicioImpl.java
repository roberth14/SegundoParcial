package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Continente;
import com.app.web.entidad.Seleccion;
import com.app.web.repositorio.ContinenteRepositorio;


@Service
public class ContinenteServicioImpl implements ContinenteServicio {
	
	@Autowired
	private ContinenteRepositorio repositorio;
	
	@Override
	public List<Continente> listarTodosLosContinentes() {
		return repositorio.findAll();
	}

	@Override
	public Continente guardarContinente(Continente continente) {
		return repositorio.save(continente);
		
	}

	@Override
	public Continente obterContinentePorI(Long id) {
		return repositorio.findById(id).get();
	}

}
