package org.vipsion.oca.modelo;

import java.util.ArrayList;
import java.util.List;
import org.vipsion.oca.controlador.Coordinador;

/**
 *Representacion del propio juego
 * @author Vaquero
 */
public class Juego {

    private Coordinador coordinador;
    private final List<Jugador> jugadores;
    private int turno = 0;
    private final Tablero tablero;
    private final int numJugadores = 2;

    /**
     *Instancia de los valores creados por el propio Juego
     * @see Jugador
     * @see Tablero
     */
    public Juego() {
        jugadores = new ArrayList<>();
        tablero = new Tablero();
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
    }

    /**
     *Establece al coordinador de la partida
     * @param coordinador Representa la instancia del coordinador
     */
    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    /**
     *Establece el turno de los jugadores
     * @see Jugador#getTurnosExtra() 
     * @see Jugador#decrementaTurnosExtra() 
     * @return <code>sigTurno</code> 
     */
    public int sigTurno() {
        int sigTurno;
        sigTurno = (turno + 1) % numJugadores;
        if (jugadores.get(turno).getTurnosExtra() > 0) {
            sigTurno = turno;
            jugadores.get(turno).decrementaTurnosExtra();
        }
        return (sigTurno);
    }

    /**
     *Representa el avance de los turnos
     * @return <code>turno</code>
     */
    public int avanzaTurno() {
        turno = sigTurno();
        return turno;
    }

    /**
     *Establece el turno de cada jugador
     * @param turno Turno de la persona que le toca jugar
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }

    /**
     *Devuelve los turnos de los jugadores
     * @return <code>turno</code>
     */
    public int getTurno() {
        return (turno);
    }

    /**
     *Devuelve el ultimo valor del dado a los jugadores
     * @see Jugador#getUltimoValorDado() 
     * @return <code>valorDado</code>
     */
    public int ultimoValorDado() {
        return jugadores.get(turno).getUltimoValorDado();
    }

    /**
     *Establece la ultima posicion de la ficha de cada jugador
     * @see Jugador#getUltimaPosicionTablero() 
     * @return <code>posicion</code>
     */
    public int ultimaPosicionTablero() {
        return jugadores.get(turno).getUltimaPosicionTablero();
    }

    /**
     *Fija el turno y la ficha en el tablero
     * @see Jugador#juegaTurno(org.vipsion.oca.modelo.Tablero) 
     */
    public void juega() {
        jugadores.get(turno).juegaTurno(tablero);
    }

    /**
     *Establece si algunos de los jugadores ha ganado
     * @see Jugador#esGanador() 
     * @return <code>true or false</code>
     */
    public Boolean esFin() {
        return jugadores.get(turno).esGanador();
    }
}
