package com.juan.springangular.models.service;

import java.util.List;

import com.juan.springangular.models.entity.Destino;

public interface IDestinoService {
	
	public List<Destino> findAll();
	
	public Destino findById(int id);
	
	public Destino save(Destino destino);
	
	public void delete(int id);

}
