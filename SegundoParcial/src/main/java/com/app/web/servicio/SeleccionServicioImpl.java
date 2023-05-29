package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.web.entidad.Seleccion;
import com.app.web.repositorio.ContinenteRepositorio;
import com.app.web.repositorio.SeleccionRepositorio;

public class SeleccionServicioImpl implements SeleccionServicio{

	@Autowired
	private SeleccionRepositorio repositorio;
	
	@Override
	public List<Seleccion> listarTodosLasSelecciones() {
		return repositorio.findAll();
	}

	@Override
	public Seleccion guardarSeleccion(Seleccion seleccion) {
		return repositorio.save(seleccion);
	}

	@Override
	public Seleccion obterSeleccionPorI(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public void eliminarSeleccion(Long id) {
		repositorio.deleteById(id);
		
	}
	
	

}
