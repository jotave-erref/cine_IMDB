package com.jotaveerref.cineIMDB;

import com.jotaveerref.cineIMDB.CineMain.CineApp;
import com.jotaveerref.cineIMDB.model.DadosSerie;
import com.jotaveerref.cineIMDB.service.ConsomeDados;
import com.jotaveerref.cineIMDB.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CineImdbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CineImdbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsomeDados consomeDados = new ConsomeDados();
		ConverteDados converteDados = new ConverteDados();
		var json = consomeDados.buscaDados("https://www.omdbapi.com/?t=vikings&apikey=ec8241d7");
		var dadosSerie = converteDados.conversorDeDados(json, DadosSerie.class);
		System.out.println(dadosSerie);
	}
}
