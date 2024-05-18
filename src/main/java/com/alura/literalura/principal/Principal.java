package com.alura.literalura.principal;

import java.util.Scanner;

public class Principal {
private   Scanner teclado = new Scanner(System.in);

    public void menu(){
        var opcion = 1;
        while (opcion != 0) {
            System.out.println("""
                    1.-Buscar Libro
                    2.-Listar Libros Registrados
                    3.-Listar Atores Registrados
                    4.-Listar Autores vivos en determinados años
                    5.-Listar libros por idioma
                    6.-salir
                    """);

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
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
                    opcion = 0;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }





    public void buscarLibroPorTitulo(){
        String titulo;
        System.out.println("Ingresa el Nombre del Libro");
        titulo = teclado.nextLine();
    }

    private void listarLibrosRegistrados() {
    }
    private void listarAutoresRegistrados() {

    }
    private void listarAutoresDeIgualEpoca() {
    }
    private void listarLibrosPorIdioma() {
    }




}
