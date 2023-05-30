package co.com.app.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.app.web.entities.Seleccion;



public interface ISeleccionRepository extends JpaRepository<co.com.app.web.entities.Seleccion, Integer> {
	
	public List<Seleccion>findByGrupo(String grupo);

}
