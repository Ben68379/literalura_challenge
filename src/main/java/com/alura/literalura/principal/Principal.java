package com.alura.literalura.principal;

import com.alura.literalura.model.Titulo;
import com.alura.literalura.model.TituloDatos;
import com.alura.literalura.repository.TitulosRepository;
import com.alura.literalura.service.ConsumoAPI;
import com.alura.literalura.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private final String URL_BASE = "https://gutendex.com/books?search=";
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);
    private TitulosRepository repository;

    public void menu() {
        var option = -1;
        while (option != 0 ) {
            System.out.println("""
                    Menu
                    1
                    2
                    3
                    4
                    5
                    6

                    """);
            option = teclado.nextInt();
            switch (option){
                case 1:
                    buscarLibroPorTitulo();
                    break;
                case 2:
                    listarLibrosRegistrados();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresDeIgualEpoca();
                    break;
                case 5:
                    listarLibrosPorIdioma();
                    break;
                case 6:
                    System.out.println("Saliendo..");
                    option = 0;
                    break;

                default:
                    System.out.println("Ingresa una opcion valida");
                    break;

            }

        }
    }

    public void buscarLibroPorTitulo(){
        TituloDatos datos = getTitulosDatos();
        Titulo libro = new Titulo(datos);
        repository.save(libro);
        //datosSeries.add(datos);
        System.out.println(datos);

    }

    private void listarLibrosRegistrados() {
    }
    private void listarAutoresRegistrados() {

    }
    private void listarAutoresDeIgualEpoca() {
    }
    private void listarLibrosPorIdioma() {
    }
    private TituloDatos getTitulosDatos() {

        System.out.println("Escribe el nombre del libro que deseas buscar");
        var nombreLibro = teclado.nextLine();
        var json = consumoApi.obtenerDatos(URL_BASE + nombreLibro.replace(" ", "+"));
        System.out.println(json);
        TituloDatos datos = conversor.obtenerDatos(json, TituloDatos.class);
        return datos;
    }
}
