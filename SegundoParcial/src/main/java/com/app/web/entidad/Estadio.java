package com.app.web.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estadio")
public class Estadio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long serial;
	
	

	public Estadio() {
		super();
	}

	public Estadio(Long serial) {
		super();
		this.serial = serial;
	}

	public Long getSerial() {
		return serial;
	}

	public void setSerial(Long serial) {
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "Estadio [serial=" + serial + "]";
	}
	
	
}
