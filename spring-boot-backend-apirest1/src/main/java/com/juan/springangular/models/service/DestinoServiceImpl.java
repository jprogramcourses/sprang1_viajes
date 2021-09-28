package com.juan.springangular.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.juan.springangular.models.dao.IDestinoDao;
import com.juan.springangular.models.entity.Destino;

@Service
public class DestinoServiceImpl implements IDestinoService {
	
	@Autowired
	private IDestinoDao destinoDao;

	@Override
	@Transactional(readOnly=true)
	public List<Destino> findAll() {
		return destinoDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Destino findById(int id) {
		return destinoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Destino save(Destino destino) {
		return destinoDao.save(destino);
	}

	@Override
	@Transactional
	public void delete(int id) {
		destinoDao.deleteById(id);
	}

}
