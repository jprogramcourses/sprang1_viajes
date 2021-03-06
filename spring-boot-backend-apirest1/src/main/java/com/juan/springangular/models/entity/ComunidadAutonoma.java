package com.juan.springangular.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "COMUNIDADES_AUTONOMAS")
public class ComunidadAutonoma implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idComunidad;
	@NotNull
	private String nombre;
	
	public ComunidadAutonoma() {
		
	}

	public Long getIdComunidad() {
		return idComunidad;
	}

	public void setIdComunidad(Long idComunidad) {
		this.idComunidad = idComunidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
