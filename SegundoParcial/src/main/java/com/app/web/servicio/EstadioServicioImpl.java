package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.web.entidad.Estadio;
import com.app.web.repositorio.EstadioRepositorio;

public class EstadioServicioImpl implements EstadioServicio{

	@Autowired
	private EstadioRepositorio repositorio;
	
	@Override
	public List<Estadio> listarTodosLosEstadios() {
		return repositorio.findAll();
	}
	

}
