package com.jotaveerref.cineIMDB.CineMain;

import com.jotaveerref.cineIMDB.model.DadosSerie;
//import com.jotaveerref.cineIMDB.model.Serie;
import com.jotaveerref.cineIMDB.service.ConsomeDados;
import com.jotaveerref.cineIMDB.service.ConverteDados;

import java.util.Scanner;

public class CineApp {
    private Scanner sc = new Scanner(System.in);
    private ConverteDados converteDados = new ConverteDados();
    private ConsomeDados consomeDados = new ConsomeDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=ec8241d7";

    public DadosSerie buscaSerie() {
        System.out.println("Input serie name:");
        var nomeSerie = sc.nextLine();
        var json = consomeDados.buscaDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        var dados = converteDados.conversorDeDados(json, DadosSerie.class);
        return dados;
    }
}