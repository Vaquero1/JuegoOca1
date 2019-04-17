package org.vipsion.oca.modelo;

/**
 * Representa una casilla que indica el final del juego.<br>
 * Hereda de la Clase Casilla
 * @author Vaquero
 * @see Casilla
 */
public class Fin extends Casilla {

    /**
     *Instancia una casilla
     * @param posicion es el número que se le asigna a casilla.
     */
    public Fin(int posicion) {
        super(posicion);
    }

    /**
     * Método heredado<br>
     * Fija la propiedad fin de la ficha a <code>true</code> 
     * @param ficha {@inheritDoc}
     * @see Ficha#setFin(java.lang.Boolean) 
     */
    @Override
    public void posaFicha(Ficha ficha) {
        ficha.setFin(true);
    }
}
