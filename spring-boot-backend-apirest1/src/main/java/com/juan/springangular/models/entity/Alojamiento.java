package com.juan.springangular.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Alojamiento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAlojamiento;
	private String nombre;
	private String descripcion;
	private Integer precio;
	private double latAlojamiento;
	private double lngAlojamiento;
	private CalidadAlojamiento calidad;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	public Alojamiento() {
	}

	public long getIdAlojamiento() {
		return idAlojamiento;
	}

	public void setIdAlojamiento(long idAlojamiento) {
		this.idAlojamiento = idAlojamiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public double getLatAlojamiento() {
		return latAlojamiento;
	}

	public void setLatAlojamiento(double latAlojamiento) {
		this.latAlojamiento = latAlojamiento;
	}

	public double getLngAlojamiento() {
		return lngAlojamiento;
	}

	public void setLngAlojamiento(double lngAlojamiento) {
		this.lngAlojamiento = lngAlojamiento;
	}

	public CalidadAlojamiento getCalidad() {
		return calidad;
	}

	public void setCalidad(CalidadAlojamiento calidad) {
		this.calidad = calidad;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
}
