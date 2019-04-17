package org.vipsion.oca.modelo;

/**
 *Representa la ficha del jugador
 * @author Vaquero
 */
public class Ficha {

    private int posicion;
    private int turnosExtra;
    private Boolean fin;
    // private int turnosSinTirar; 

    /**
     *Indica el fin de partida
     * @return <code>fin</code>
     */
    public Boolean getFin() {
        return fin;
    }

    /**
     *Representa el fin de la partida
     * @param fin Representa el valor
     */
    public void setFin(Boolean fin) {
        this.fin = fin;
    }

    /**
     *Representacion de la instancia Ficha, inicializada
     */
    public Ficha() {
        posicion = 1;
        fin = false;
        turnosExtra = 0;
    }

    /**
     *Indica la posición de la ficha
     * @return <code>posicion</code>
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     *Representa la posicion de la ficha
     * @param posicion valor que se le asigna a la Ficha
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    /**
     * Indica la posibilidad de un turno extra
     * @return <code>turnosExtra</code>
     */
    public int getTurnosExtra() {
        return turnosExtra;
    }

    /**
     * Representa el turnoExtra de un jugador
     * @param turnosExtra valor que asigna uno o varios turnos mas a un jugador
     */
    public void setTurnosExtra(int turnosExtra) {
        this.turnosExtra = turnosExtra;
    }

    /**
     *Disminucion de los turnosExtra
     */
    public void decrementaTurnosExtra() {
        turnosExtra--;
    }

}
