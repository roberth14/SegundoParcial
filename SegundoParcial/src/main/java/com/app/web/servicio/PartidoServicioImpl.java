package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Partido;
import com.app.web.repositorio.ContinenteRepositorio;
import com.app.web.repositorio.PartidoRepositorio;

@Service
public class PartidoServicioImpl implements PartidoServicio{

	@Autowired
	private PartidoRepositorio repositorio;
	
	@Override
	public List<Partido> listarTodosLosPartidos() {
		return repositorio.findAll();
	}

	@Override
	public Partido guardarPartido(Partido partido) {
		return repositorio.save(partido);
	}

	@Override
	public Partido obterPartidoPorI(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public void eliminarPartido(Long id) {
		repositorio.deleteById(id);
		
	}

}
