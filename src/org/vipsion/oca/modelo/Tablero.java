package org.vipsion.oca.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *Representa el tablero del juego a traves de Casilla que indica el número total de casillas.
 * @author Vaquero
 * @see Casilla
 */
public class Tablero {

    private List<Casilla> casillas;
    private final int numCasillas;

    /**
     *Instancia un tablero de <code>63</code> casillas<br>
     * Se fijan determinadas casillas al tipo Oca,OcaFin y Fin
     * @see Casilla
     * @see Oca
     * @see OcaFin
     * @see Fin
     */
    public Tablero() {
        this.numCasillas = 63;
        this.casillas = new ArrayList<>();
        for (int i = 0; i < numCasillas; i++) {
            this.casillas.add(new Casilla(i + 1));
        }
        casillas.set(8, new Oca(9, 5));
        casillas.set(17, new Oca(18, 5));
        casillas.set(26, new Oca(27, 5));
        casillas.set(35, new Oca(36, 5));
        casillas.set(44, new Oca(45, 5));
        casillas.set(53, new Oca(54, 5));
        casillas.set(4, new Oca(5, 4));
        casillas.set(13, new Oca(14, 4));
        casillas.set(22, new Oca(23, 4));
        casillas.set(31, new Oca(32, 4));
        casillas.set(40, new Oca(41, 4));
        casillas.set(49, new Oca(50, 4));
        casillas.set(54, new OcaFin(59, 4));
        casillas.set(62, new Fin(63));
        casillas.set(25, new Dado1(26));
        casillas.set(52, new Dado1(56));
        casillas.set(57, new CasillaCalavera(58));
    }

    /**
     *Se encarga de actualizar la posición de una Ficha sumando su posición actual más el número del dado.<br>
     * Comprueba el desplazamiento de la ficha si es superior a fin <i>rebota</i>.
     * @param ficha que tenga el turno y proceda a desplazarse
     * @param numDado Valor generado por Dado
     * @see Ficha
     * @see Ficha#getPosicion() 
     * @see Casilla#posaFicha(org.vipsion.oca.modelo.Ficha) 
     * @see Dado
     */
    public void mueveFicha(Ficha ficha, int numDado) {

        int numCasilla = ficha.getPosicion() + numDado;

        if (numCasilla > numCasillas) {
            numCasilla = (numCasillas - ((ficha.getPosicion() + numDado) - numCasillas));
        }
        casillas.get(numCasilla - 1).posaFicha(ficha);
    }

}
