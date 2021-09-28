package com.juan.springangular.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.juan.springangular.models.entity.Destino;

@Repository
public interface IDestinoDao extends JpaRepository<Destino, Integer> {

}
