package com.app.web.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="resutado")
public class Resultado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="partido_id", nullable=false,length=50)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partidoId;
	
	@Column(name ="seleccion_id", nullable=false,length=50)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seleccionId;
	
	@Column(name ="goles", nullable=false,length=50, unique=true)
	private int goles;
	
	@Column(name ="amarillas", nullable=false,length=50, unique=true)
	private int amarillas;
	
	@Column(name ="rojas", nullable=false,length=50, unique=true)
	private int rojas;

	public Resultado() {
		super();
	}

	public Resultado(Long id, int partidoId, int seleccionId, int goles, int amarillas, int rojas) {
		super();
		this.id = id;
		this.partidoId = partidoId;
		this.seleccionId = seleccionId;
		this.goles = goles;
		this.amarillas = amarillas;
		this.rojas = rojas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPartidoId() {
		return partidoId;
	}

	public void setPartidoId(int partidoId) {
		this.partidoId = partidoId;
	}

	public int getSeleccionId() {
		return seleccionId;
	}

	public void setSeleccionId(int seleccionId) {
		this.seleccionId = seleccionId;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getAmarillas() {
		return amarillas;
	}

	public void setAmarillas(int amarillas) {
		this.amarillas = amarillas;
	}

	public int getRojas() {
		return rojas;
	}

	public void setRojas(int rojas) {
		this.rojas = rojas;
	}
	
	

}
