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
@Table(name = "partido")
public class Partido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serial;

	@Column
	private String fecha;
	
	@ManyToOne
	@JoinColumn(name="estadio_id")
	private Estadio estadio;
	
	public Partido() {
		super();
	}

	public Partido(Long serial, String fecha, Estadio estadio) {
		super();
		this.serial = serial;
		this.fecha = fecha;
		this.estadio = estadio;
	}

	public Long getSerial() {
		return serial;
	}

	public void setSerial(Long serial) {
		this.serial = serial;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	
}
