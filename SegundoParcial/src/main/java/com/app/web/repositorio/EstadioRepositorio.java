package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Continente;
import com.app.web.entidad.Estadio;



@Repository
public interface EstadioRepositorio extends JpaRepository<Estadio,Long> {

}
