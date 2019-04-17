package org.vipsion.oca.modelo;

/**
 *Representa al jugador
 * @author Vaquero
 */
public class Jugador {

    private final Ficha ficha;
    private int ultimoValorDado;

    /**
     *Instancia una ficha por cada jugador
     * @see Ficha
     */
    public Jugador() {
        this.ficha = new Ficha();
    }

    /**
     *Gestiona los movimientos de cada jugador en su turno
     * @param tablero Representa el numero de casillas establecidas
     * @return <code>ficha.getPosicion</code>
     * @see Ficha#getPosicion()
     * @see Tablero#mueveFicha(org.vipsion.oca.modelo.Ficha, int) 
     */
    public int juegaTurno(Tablero tablero) {
        ultimoValorDado = Dado.dameNumero();
        tablero.mueveFicha(ficha, ultimoValorDado);
        return ficha.getPosicion();
    }

    /**
     *Devuelve el ultimo valor obtenido por el dado
     * @return <code>ultimoValorDado</code>
     */
    public int getUltimoValorDado() {
        return ultimoValorDado;
    }

    /**
     *Establece el ultimo valor del dado
     * @param ultimoValorDado valor del dado
     */
    public void setUltimoValorDado(int ultimoValorDado) {
        this.ultimoValorDado = ultimoValorDado;
    }

    /**
     *Retorna la posicion de la ficha en el tablero
     * @return <code>ficha.getPosicion</code>
     * @see Ficha#getPosicion() 
     */
    public int getUltimaPosicionTablero() {
        return ficha.getPosicion();
    }

    /**
     *Retorna si alguno de los jugadores tiene turno extra
     * @return <code>ficha</code>
     * @see Ficha#getTurnosExtra() 
     */
    public int getTurnosExtra() {
        return (ficha.getTurnosExtra());
    }

    /**
     *Reduce los turnos extra de los jugadores
     * @see Ficha#decrementaTurnosExtra() 
     */
    public void decrementaTurnosExtra() {
        ficha.decrementaTurnosExtra();
    }

    /**
     *Determina si algun jugador ha ganado
     * @return <code>fin ganador</code>
     * @see Ficha#getFin() 
     */
    public Boolean esGanador() {
        return ficha.getFin();
    }
}
