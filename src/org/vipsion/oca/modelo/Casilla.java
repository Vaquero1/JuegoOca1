package org.vipsion.oca.modelo;

/**
 *Representa una casilla del juego.
 * @author Vaquero
 */
public class Casilla {

    /**
     *Creación de la variable posición
     */
    protected int posicion;

    /**
     *Instancia una casilla con una posición.
     * @param posicion es el número de casilla que se le asigna a casilla.
     */
    public Casilla(int posicion) {
        this.posicion = posicion;
    }

    /**
     *<p>Instancia ficha se le asigna la posición de la casilla</p> 
     * @param ficha que se posa en esa casilla
     * @see Ficha#setPosicion(int) 
     */
    public void posaFicha(Ficha ficha) {
        ficha.setPosicion(posicion);
    }

}
