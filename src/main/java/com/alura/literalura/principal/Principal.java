package com.alura.literalura.principal;

import com.alura.literalura.LiteraluraApplication;

import java.util.Scanner;

public class Principal {

    private Scanner teclado = new Scanner(System.in);

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
