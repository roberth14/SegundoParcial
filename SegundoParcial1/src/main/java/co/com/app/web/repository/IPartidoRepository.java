package co.com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.app.web.entities.Partido;


public interface IPartidoRepository  extends JpaRepository<Partido, Integer>{
	

}
