package com.juan.springangular.models.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.juan.springangular.models.entity.Destino;
import com.juan.springangular.models.service.IDestinoService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class DestinoRestController {
	
	@Autowired
	private IDestinoService destinoService;
	
	@GetMapping("/destinos")
	public List<Destino> index(){
		return destinoService.findAll();
	}
	
	@GetMapping("/destinos/{idDestino}")
	public Destino findById(@PathVariable int idDestino) {
		return destinoService.findById(idDestino);
	}
	
	@PostMapping("/destinos")
	@ResponseStatus(HttpStatus.CREATED)
	public Destino saveDestino(@RequestBody Destino destino) {
		return destinoService.save(destino);
	}
	
	@PutMapping("/destinos/{idDestino}")
	@ResponseStatus(HttpStatus.CREATED)
	public Destino updateDestino(@RequestBody Destino destino, @PathVariable int idDestino) {
		Destino destinoActual = destinoService.findById(idDestino);
		destinoActual.setNombre(destino.getNombre());
		destinoActual.setDescripcion(destino.getDescripcion());
		destinoActual.setLat(destino.getLat());
		destinoActual.setLng(destino.getLng());
		return destinoService.save(destinoActual);
	}
	
	@DeleteMapping("/destinos/{idDestino}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteDestino(@PathVariable int idDestino) {
		destinoService.delete(idDestino);
	}

}
