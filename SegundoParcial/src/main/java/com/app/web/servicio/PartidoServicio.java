package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Partido;

public interface PartidoServicio {
	
	public List<Partido> listarTodosLosPartidos();
	public Partido guardarPartido(Partido partido);
	public Partido obterPartidoPorI(Long id);
	public void eliminarPartido(Long id);

}
