package com.alura.literalura.model;

public enum Idioma {
    ESPAÑOL("Es"),
    INGLES("En"),
    FRANCES("Fr"),
    PORTUGUES("Br"),
    RUSO("Rs");
    private String idioma;

    Idioma (String idioma){
        this.idioma = idioma;
    }
    public static Idioma fromString(String text) {
        for (Idioma idioma : Idioma.values()) {
            if (idioma.idioma.equalsIgnoreCase(text)) {
                return idioma;
            }
        }
        throw new IllegalArgumentException("Ninguna categoría encontrada: " + text);
    }

}
