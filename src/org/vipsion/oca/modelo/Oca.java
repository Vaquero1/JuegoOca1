package org.vipsion.oca.modelo;

/**
 * Tipo de Casilla que representa las Ocas<br>
 * Propiedades desplazamiento y turnosExtra de valor constante
 * @author Vaquero
 * @see Casilla
 */
public class Oca extends Casilla {

    private final int desplazamiento;
    private final int turnosExtra;

    /**
     * Instancia de la Casilla Oca con su posición y desplazamiento<br>
     * Se le añade un turno extra.
     * @param posicion es el número de casilla que se le asigna a casilla.
     * @param desplazamiento Valor que le coloque en la siguiente casilla oca
     */
    public Oca(int posicion, int desplazamiento) {
        super(posicion);
        this.desplazamiento = desplazamiento;
        this.turnosExtra = 1;
    }

    /**
     *{@inheritDoc }<br>
     * Se le añade un turno extra a la instancia ficha.
     * @param ficha {@inheritDoc}
     * @see Ficha#setPosicion(int) 
     * @see Ficha#setTurnosExtra(int) 
     */
    @Override
    public void posaFicha(Ficha ficha) {
        ficha.setPosicion(posicion + desplazamiento);
        ficha.setTurnosExtra(turnosExtra);
    }
}
