package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Partido;
import com.app.web.entidad.Seleccion;

public interface SeleccionServicio {
	
	public List<Seleccion> listarTodosLasSelecciones();
	public Seleccion guardarSeleccion(Seleccion seleccion);
	public Seleccion obterSeleccionPorI(Long id);
	public void eliminarSeleccion(Long id);

}
