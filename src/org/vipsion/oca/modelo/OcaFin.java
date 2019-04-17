package org.vipsion.oca.modelo;

/**
 *Representa la Casilla última de Oca
 * @author Vaquero
 */
public class OcaFin extends Casilla {

    private final int desplazamiento;

    /**
     *Instancia la Casilla OcaFin  con su posición y desplazamiento<br>
     * @param posicion es el número de casilla que se le asigna a casilla.
     * @param desplazamiento Valor que le hace desplazarse hacia fin
     * @see Fin
     */
    public OcaFin(int posicion, int desplazamiento) {
        super(posicion);
        this.desplazamiento = desplazamiento;
    }

    /**
     *{@inheritDoc}
     * @param ficha {@inheritDoc}
     * @see Ficha#setPosicion(int) 
     * @see Ficha#setFin(java.lang.Boolean) 
     */
    @Override
    public void posaFicha(Ficha ficha) {
        ficha.setPosicion(posicion + desplazamiento);
        ficha.setFin(true);
    }
}
