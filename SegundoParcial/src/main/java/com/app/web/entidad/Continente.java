package com.app.web.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "continente")
public class Continente {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serial;
	
	@Column(name ="nombre", nullable=false,length=50)
	private String nombre;

	public Continente() {
		super();
	}

	public Continente(Long serial, String nombre) {
		super();
		this.serial = serial;
		this.nombre = nombre;
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
	
	
	
	
	
}
