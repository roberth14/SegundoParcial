package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Continente;



@Repository
public interface ContinenteRepositorio extends JpaRepository<Continente,Long> {

}
