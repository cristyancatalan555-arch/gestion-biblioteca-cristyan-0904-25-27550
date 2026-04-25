package com.cristyan._0904_25_27550.gestionbiblioteca.servicio;

import com.cristyan._0904_25_27550.gestionbiblioteca.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona la colección de libros.
 * Serie IV
 */
public class Biblioteca {
    private final List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public List<Libro> obtenerLibros() {
        return new ArrayList<>(this.libros);
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
