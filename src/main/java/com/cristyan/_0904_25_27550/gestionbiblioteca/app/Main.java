package com.cristyan._0904_25_27550.gestionbiblioteca.app;

import com.cristyan._0904_25_27550.gestionbiblioteca.modelo.Libro;
import com.cristyan._0904_25_27550.gestionbiblioteca.servicio.Biblioteca;

/**
 * Clase principal para ejecutar la aplicación.
 * Serie V
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();

        System.out.println("--- Gestion de Biblioteca - Cristyan Catalan ---");

        // 1. Agregar libros
        try {
            miBiblioteca.agregarLibro(new Libro("Java Basico", "Cristyan", 2024));
            miBiblioteca.agregarLibro(new Libro("Don Quijote", "Miguel de Cervantes", 1605));
            miBiblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 1967));
            
            System.out.println("Libros agregados exitosamente.\n");

            // 2. Probar validacion (Debe lanzar error)
            System.out.println("Probando validacion de año negativo:");
            miBiblioteca.agregarLibro(new Libro("Libro Fallido", "Autor", -5));
        } catch (IllegalArgumentException e) {
            System.out.println("Captura de error esperada: " + e.getMessage());
        }

        // 3. Mostrar todos los libros y si son antiguos
        System.out.println("\n--- Listado de Libros ---");
        for (Libro l : miBiblioteca.obtenerLibros()) {
            System.out.println("Titulo: " + l.getTitulo() + 
                               " | Autor: " + l.getAutor() + 
                               " | Antiguo (<2000): " + (l.esAntiguo() ? "SI" : "NO"));
        }

        // 4. Probar busqueda
        System.out.println("\nBuscando libro 'Don Quijote'...");
        Libro encontrado = miBiblioteca.buscarPorTitulo("Don Quijote");
        if (encontrado != null) {
            System.out.println("Resultado: Encontrado! El autor es " + encontrado.getAutor());
        }
    }
}
