package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.web.entidad.Partido;
import com.app.web.entidad.Resultado;
import com.app.web.repositorio.EstadioRepositorio;
import com.app.web.repositorio.ResultadoRepositorio;

public class ResultadoServicioImpl implements ResultadoServicio {

	@Autowired
	private ResultadoRepositorio repositorio;

	@Override
	public List<Resultado> listarTodosLosResultado() {
		return repositorio.findAll();
	}

	@Override
	public Resultado guardarResultado(Resultado resultado) {
		return repositorio.save(resultado);
	}

	@Override
	public Resultado obterResultadoPorI(Long id) {
		return repositorio.findById(id).get();
	}

}
