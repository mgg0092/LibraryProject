/*
 * La clase Libro representa un libro con un identificador unico, titulo, autor y genero.
 */
package com.mycompany;

public class Libro {

    // Atributos de la clase Libro
    private int idLibro; // Identificador unico del libro
    private String titulo; // Titulo del libro
    private String autor; // Autor del libro
    private String genero; // Genero al que pertenece el libro

    /**
     * Constructor para crear un nuevo objeto Libro con titulo, autor y genero
     * dados.
     * Asigna un identificador unico al libro.
     *
     * @param titulo Titulo del libro.
     * @param autor  Autor del libro.
     * @param genero Genero al que pertenece el libro.
     */
    public Libro(String titulo, String autor, String genero) {
        this.idLibro = (int) (Math.random() * 10000) + 1; // Generar un id aleatorio entre 1 y 10000
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    /**
     * Obtiene el identificador unico del libro.
     *
     * @return El identificador unico del libro.
     */
    public int getIdLibro() {
        return this.idLibro;
    }

    /**
     * Establece el identificador unico del libro.
     *
     * @param value El nuevo valor para el identificador unico del libro.
     */
    public void setIdLibro(int value) {
        this.idLibro = value;
    }

    /**
     * Obtiene el titulo del libro.
     *
     * @return El titulo del libro.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Establece el titulo del libro.
     *
     * @param value El nuevo titulo para el libro.
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * Establece el autor del libro.
     *
     * @param value El nuevo autor para el libro.
     */
    public void setAutor(String value) {
        this.autor = value;
    }

    /**
     * Obtiene el genero del libro.
     *
     * @return El genero del libro.
     */
    public String getGenero() {
        return this.genero;
    }

    /**
     * Establece el genero del libro.
     *
     * @param value El nuevo genero para el libro.
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Retorna una representacion de cadena del objeto Libro.
     *
     * @return Una cadena que representa el objeto Libro.
     */
    @Override
    public String toString() {
        return "Informacion del libro: " + "\n"
                + "\t [+] ID: " + this.idLibro + "\n"
                + "\t [+] Titulo: " + this.titulo + "\n"
                + "\t [+] Autor: " + this.autor + "\n"
                + "\t [+] Genero: " + this.genero + "\n";
    }
}
