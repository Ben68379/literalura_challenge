package com.alura.literalura.model;

import jakarta.persistence.*;

import java.util.Optional;
import java.util.OptionalDouble;

@Entity
@Table(name = "libros")
public class Titulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autores;
    private Integer fechaNacimiento;
    private Integer fechaMuerte;
    @Enumerated(EnumType.STRING)
    private Idioma idioma;

    public Titulo(){}

    public Titulo(TituloDatos datosTitulo){
        this.titulo = datosTitulo.titulo();
        this.autores = datosTitulo.autores();
        this.fechaNacimiento = datosTitulo.fechaNacimiento();
        this.idioma = Idioma.fromString(datosTitulo.idioma().split(",")[0].trim());
        this.fechaMuerte = datosTitulo.fechaMuerte();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(Integer fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }
    @Override
    public String toString() {
        return  "idioma=" + idioma +
                "titulo='" + titulo + '\'' +
                ", autores=" + autores +
                ", fecha de nacimiento de autor=" + fechaNacimiento +
                ", fecha de muerte de autor=" + fechaMuerte + '\'';
    }

}
