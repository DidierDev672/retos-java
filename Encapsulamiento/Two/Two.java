package Encapsulamiento.Two;

import java.util.ArrayList;
import java.util.List;

/*
 * Crea una clase Libro con atributos encapsulados para titulo, autor y cantidadCopias. 
 * Luego, implementa una clase Biblioteca que mantenga una colección de libros y proporcione 
 * métodos para agregar, buscar y prestar libros. El objetivo es practicar el uso de encapsulamiento 
 * para mantener la lógica de la biblioteca.
 */

class Libro {
    private String titulo;
    private String autor;
    private int cantidadCopias;

    public Libro(String titulo, String autor, int cantidadCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadCopias = cantidadCopias;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public boolean prestar() {
        if (cantidadCopias > 0) {
            cantidadCopias--;
            return true;
        } else {
            return false;
        }
    }
}

class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().contentEquals(titulo)) {
                return libro;
            }
        }

        return null;
    }

    public boolean prestarLibro(String titulo) {
        Libro isLibro = buscarLibro(titulo);
        System.out.println("IsLibro: " + isLibro);
        if (isLibro != null) {
            isLibro.prestar();
        } else {
            return false;
        }

        return false;
    }
}

public class Two {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear y agregar libros
        Libro libro = new Libro("Quijote", "Miguel de Cervantes", 5);
        Libro libro2 = new Libro("1984", "George Orwell", 2);

        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro2);

        // Buscar y prestar libros
        System.out.println("Prestando '1984': " + biblioteca.prestarLibro("1984"));
        System.out.println("Prestando 'El Quijote': " + biblioteca.prestarLibro("Quijote"));

        // Intentar prestar un libro que no existe
        System.out.println("Prestando 'Libro Desconocido': " + biblioteca.prestarLibro("Libro desconocido"));
    }
}
