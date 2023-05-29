package com.app.web.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "seleccion")
public class Seleccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serial;
	
	@Column(name ="nombre", nullable=false,length=50)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="continente_id")
	private Continente continente;
	
	
	@Column(name ="grupo", nullable=false,length=50)
	private String grupo;

	
	public Seleccion() {
		super();
	}

	public Seleccion(Long serial, String nombre, Continente continente, String grupo) {
		super();
		this.serial = serial;
		this.nombre = nombre;
		this.continente = continente;
		this.grupo = grupo;
	}

	public Long getSerial() {
		return serial;
	}

	public void setSerial(Long serial) {
		this.serial = serial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Continente getContinente() {
		return continente;
	}

	public void setContinente(Continente continente) {
		this.continente = continente;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Seleccion [serial=" + serial + ", nombre=" + nombre + ", continente=" + continente + ", grupo=" + grupo
				+ "]";
	}

	

	
}
