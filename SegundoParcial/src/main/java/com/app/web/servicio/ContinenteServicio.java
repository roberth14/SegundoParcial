package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Continente;
import com.app.web.entidad.Seleccion;

public interface ContinenteServicio {

	
	
	public List<Continente> listarTodosLosContinentes();
	public Continente guardarContinente(Continente continente);
	public Continente obterContinentePorI(Long id);

}
