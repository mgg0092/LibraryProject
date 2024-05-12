package com.mycompany;

public class Usuario {

    private int idUsuario; // Identificador unico del usuario
    private String nombre; // Nombre del usuario
    private String correoElectronico; // Correo electronico del usuario
    private String contrasena; // Contrasena del usuario

    /**
     * Constructor de Usuario que recibe correo electronico y contrasena.
     *
     * @param correoElectronico El correo electronico del usuario.
     * @param contrasena        La contrasena del usuario.
     */
    public Usuario(String correoElectronico, String contrasena) {
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    /**
     * Obtiene el identificador unico del usuario.
     *
     * @return El identificador unico del usuario.
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el identificador unico del usuario.
     *
     * @param idUsuario El nuevo valor del identificador unico del usuario.
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre El nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el correo electronico del usuario.
     *
     * @return El correo electronico del usuario.
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Establece el correo electronico del usuario.
     *
     * @param correoElectronico El nuevo correo electronico del usuario.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Obtiene la contrasena del usuario.
     *
     * @return La contrasena del usuario.
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Establece la contrasena del usuario.
     *
     * @param contrasena La nueva contrasena del usuario.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Metodo para iniciar sesion del usuario.
     * Comprueba si el correo electronico y la contrasena coinciden con los
     * almacenados.
     *
     * @param correoElectronico El correo electronico ingresado para iniciar sesion.
     * @param contrasena        La contrasena ingresada para iniciar sesion.
     */
    public void iniciarSesion(String correoElectronico, String contrasena) {
        if (correoElectronico.equals(this.correoElectronico) && contrasena.equals(this.contrasena)) {
            System.out.println("Sesion iniciada");
        } else {
            System.out.println("Correo electronico o contrasena incorrectos");
        }
    }

    /**
     * Metodo para sugerir un libro al usuario.
     * (Este metodo deberia ser implementado para manejar la logica de sugerencia de
     * libros).
     */
    public void sugerirLibro() {
        // Implementacion de la logica para sugerir un libro al usuario
    }

    /**
     * Metodo para añadir un libro a una biblioteca.
     *
     * @param biblioteca La biblioteca a la que se añadira el libro.
     * @param libro      El libro que se añadira a la biblioteca.
     */
    public void aniadirLibro(Biblioteca biblioteca, Libro libro) {
        biblioteca.aniadirLibro(libro);
    }

    /**
     * Metodo para intercambiar un libro entre dos bibliotecas.
     *
     * @param titulo            El titulo del libro a intercambiar.
     * @param bibliotecaOrigen  La biblioteca de origen del libro.
     * @param bibliotecaDestino La biblioteca de destino del libro.
     */
    public void intercambiarLibro(String titulo, Biblioteca bibliotecaOrigen, Biblioteca bibliotecaDestino) {
        Libro libro = bibliotecaOrigen.buscarLibro(titulo);
        if (libro != null) {
            bibliotecaOrigen.eliminarLibro(libro);
            bibliotecaDestino.aniadirLibro(libro);
            System.out.println("El libro '" + libro.getTitulo() + "' se ha intercambiado correctamente.");
        } else {
            System.out.println("El libro '" + titulo + "' no se pudo intercambiar.");
        }
    }
}
