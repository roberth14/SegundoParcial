package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Continente;
import com.app.web.entidad.Partido;



@Repository
public interface PartidoRepositorio extends JpaRepository<Partido,Long> {

}
