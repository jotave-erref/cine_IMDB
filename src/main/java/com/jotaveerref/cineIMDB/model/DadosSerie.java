package com.jotaveerref.cineIMDB.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(
        @JsonAlias("Title")
        String titulo,
        @JsonAlias("Genre")
        String genero,
        @JsonAlias("imdbRating")
        String avaliacao,
        @JsonAlias("totalSeasons")
        Integer totalTemporadas) {
}
