package co.com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.app.web.entities.Estadio;

public interface IEstadioRepository extends JpaRepository<Estadio, Integer> {

}
