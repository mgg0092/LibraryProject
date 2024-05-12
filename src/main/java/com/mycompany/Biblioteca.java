/*
 * La clase Biblioteca representa una coleccion de libros.
 */
package com.mycompany;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros; // Lista de libros en la biblioteca
    private String nombre; // Nombre de la biblioteca
    private int idBiblioteca; // Identificador unico de la biblioteca
    private boolean compartido; // Indica si la biblioteca esta compartida o no

    /**
     * Constructor para crear un objeto Biblioteca con un nombre dado.
     * Genera un identificador unico para la biblioteca.
     *
     * @param nombre Nombre de la biblioteca.
     */
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.idBiblioteca = (int) (Math.random() * 10000) + 1; // Generar un id aleatorio entre 1 y 10000
        this.compartido = false; // Por defecto, la biblioteca no esta compartida
    }

    /**
     * Obtiene el nombre de la biblioteca.
     *
     * @return El nombre de la biblioteca.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la biblioteca.
     *
     * @param nombre El nuevo nombre para la biblioteca.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador unico de la biblioteca.
     *
     * @return El identificador unico de la biblioteca.
     */
    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    /**
     * Establece el identificador unico de la biblioteca.
     *
     * @param idBiblioteca El nuevo identificador unico para la biblioteca.
     */
    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    /**
     * Verifica si la biblioteca esta compartida.
     *
     * @return true si la biblioteca esta compartida, false de lo contrario.
     */
    public boolean isCompartido() {
        return compartido;
    }

    /**
     * Establece si la biblioteca esta compartida o no.
     *
     * @param compartido true para marcar la biblioteca como compartida, false de lo
     *                   contrario.
     */
    public void setCompartido(boolean compartido) {
        this.compartido = compartido;
    }

    /**
     * Obtiene la lista de libros en la biblioteca.
     *
     * @return La lista de libros en la biblioteca.
     */
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    /**
     * Establece la lista de libros en la biblioteca.
     *
     * @param libros La nueva lista de libros para la biblioteca.
     */
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Anade un libro a la biblioteca.
     *
     * @param libro El libro a anadir a la biblioteca.
     */
    public void aniadirLibro(Libro libro) {
        if (libros == null) {
            libros = new ArrayList<>(); // Inicializar la lista si es nula
        }
        libros.add(libro); // Agregar el libro a la lista de libros
    }

    /**
     * Elimina un libro de la biblioteca.
     *
     * @param libro El libro a eliminar de la biblioteca.
     */
    public void eliminarLibro(Libro libro) {
        libros.remove(libro); // Eliminar el libro de la lista de libros
    }

    /**
     * Busca un libro por titulo en la biblioteca.
     *
     * @param titulo El titulo del libro a buscar.
     * @return El primer libro encontrado con el titulo especificado, o null si no
     *         se encuentra ningun libro.
     */
    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro; // Retorna el primer libro encontrado con el titulo especificado
            }
        }
        return null; // Retorna null si no se encuentra ningun libro con el titulo especificado
    }
}
