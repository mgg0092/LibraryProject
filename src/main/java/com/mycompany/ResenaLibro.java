package com.mycompany;

public class ResenaLibro {

    private int idResena; // Identificador unico de la reseña
    private int idUsuario; // Identificador del usuario que escribio la reseña
    private int idLibro; // Identificador del libro que está siendo reseñado
    private int calificacion; // Calificacion numerica asignada al libro en la reseña
    private String comentario; // Comentario escrito por el usuario sobre el libro

    /**
     * Constructor por defecto de ReseñaLibro.
     */
    public ResenaLibro() {
        // Constructor vacio
    }

    /**
     * Obtiene el identificador unico de la reseña.
     *
     * @return El identificador unico de la reseña.
     */
    public int getIdResena() {
        return idResena;
    }

    /**
     * Establece el identificador unico de la reseña.
     *
     * @param idResena El nuevo identificador unico de la reseña.
     */
    public void setIdResena(int idResena) {
        this.idResena = idResena;
    }

    /**
     * Obtiene el identificador del usuario que escribio la reseña.
     *
     * @return El identificador del usuario que escribio la reseña.
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el identificador del usuario que escribio la reseña.
     *
     * @param idUsuario El nuevo identificador del usuario que escribio la reseña.
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el identificador del libro que está siendo reseñado.
     *
     * @return El identificador del libro que está siendo reseñado.
     */
    public int getIdLibro() {
        return idLibro;
    }

    /**
     * Establece el identificador del libro que está siendo reseñado.
     *
     * @param idLibro El nuevo identificador del libro que está siendo reseñado.
     */
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    /**
     * Obtiene la calificación numerica asignada al libro en la reseña.
     *
     * @return La calificación numerica asignada al libro en la reseña.
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * Establece la calificación numerica asignada al libro en la reseña.
     *
     * @param calificacion La nueva calificación numerica asignada al libro en la
     *                     reseña.
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Obtiene el comentario escrito por el usuario sobre el libro.
     *
     * @return El comentario escrito por el usuario sobre el libro.
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Establece el comentario escrito por el usuario sobre el libro.
     *
     * @param comentario El nuevo comentario escrito por el usuario sobre el libro.
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
