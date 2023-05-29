package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Partido;
import com.app.web.entidad.Resultado;

public interface ResultadoServicio {
	
	public List<Resultado> listarTodosLosResultado();
	public Resultado guardarResultado(Resultado resultado);
	public Resultado obterResultadoPorI(Long id);


}
