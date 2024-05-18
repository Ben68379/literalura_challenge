package com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@JsonIgnoreProperties(ignoreUnknown = true)
public record TituloDatos(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") String autores,
        @JsonAlias("languages") String idioma,
        @JsonAlias("birth_year") Integer fechaNacimiento,
        @JsonAlias("death_year") Integer fechaMuerte

){
}
