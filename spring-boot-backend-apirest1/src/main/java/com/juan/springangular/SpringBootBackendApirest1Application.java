package com.juan.springangular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juan.springangular.models.dao.ClimaAemetDao;

@SpringBootApplication
public class SpringBootBackendApirest1Application implements CommandLineRunner {
	
	@Autowired
	private ClimaAemetDao climaAemet;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApirest1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Línea de comandos");
		climaAemet.getDatosAemet();
	}

}
