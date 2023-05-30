package co.com.app.web.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Estadio {
	@Id
	@SequenceGenerator(name="estadio_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "estadio_id_seq")
	private Integer id;
	private String nombre;
	private Integer capacidad;

}
