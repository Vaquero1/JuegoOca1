package org.vipsion.oca.modelo;

/**
 *Representa un dado de 6 valores
 * @author Vaquero
 */
public class Dado {

    /**
     *Genera un número aleatorio
     * @return <code>[1-6]</code>
     */
    static public int dameNumero() {
        return (int) (Math.random() * 6) + 1;
    }
}
