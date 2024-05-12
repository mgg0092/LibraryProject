/*
 * La clase ConexionUsuario representa una conexion entre dos usuarios.
 */
package com.mycompany;

public class ConexionUsuario {

    private int idConexion; // Identificador unico de la conexion
    private int idUsuario1; // Identificador del primer usuario en la conexion
    private int idUsuario2; // Identificador del segundo usuario en la conexion
    private String estado; // Estado de la conexion (por ejemplo, "activo", "inactivo", "pendiente", etc.)

    /**
     * Constructor por defecto de ConexionUsuario.
     */
    public ConexionUsuario() {
        // Constructor vacio
    }

    /**
     * Obtiene el identificador unico de la conexion.
     *
     * @return El identificador unico de la conexion.
     */
    public int getIdConexion() {
        return idConexion;
    }

    /**
     * Establece el identificador unico de la conexion.
     *
     * @param idConexion El nuevo identificador unico de la conexion.
     */
    public void setIdConexion(int idConexion) {
        this.idConexion = idConexion;
    }

    /**
     * Obtiene el identificador del primer usuario en la conexion.
     *
     * @return El identificador del primer usuario en la conexion.
     */
    public int getIdUsuario1() {
        return idUsuario1;
    }

    /**
     * Establece el identificador del primer usuario en la conexion.
     *
     * @param idUsuario1 El nuevo identificador del primer usuario en la conexion.
     */
    public void setIdUsuario1(int idUsuario1) {
        this.idUsuario1 = idUsuario1;
    }

    /**
     * Obtiene el identificador del segundo usuario en la conexion.
     *
     * @return El identificador del segundo usuario en la conexion.
     */
    public int getIdUsuario2() {
        return idUsuario2;
    }

    /**
     * Establece el identificador del segundo usuario en la conexion.
     *
     * @param idUsuario2 El nuevo identificador del segundo usuario en la conexion.
     */
    public void setIdUsuario2(int idUsuario2) {
        this.idUsuario2 = idUsuario2;
    }

    /**
     * Obtiene el estado de la conexion.
     *
     * @return El estado de la conexion.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la conexion.
     *
     * @param estado El nuevo estado de la conexion.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
