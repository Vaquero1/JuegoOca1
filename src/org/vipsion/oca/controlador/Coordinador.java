package org.vipsion.oca.controlador;

import org.vipsion.oca.modelo.Juego;
import org.vipsion.oca.vista.OcaGUI;

/**
 * Sirve para intermediar entre las peticiones provenientes
 * del GUI (vistas) y los objetos que implementan la lógica de la aplicación
 * (Modelo).
 * 
 * <p>Nota: Componente del patrón (MVC o Modelo-Vista-Controlador)</p>
 *
 * @author Vaquero
 * @see Juego
 * @see OcaGUI
 * @see <a href="https://es.wikipedia.org/wiki/Modelo%E2%80%93vista%E2%80%93controlador">MVC</a>
 */
public class Coordinador {

    private OcaGUI GUI;

    private Juego juego;

    /**
     * Asocia al objeto a cargo del GUI con este coordinador
     *
     * @param GUI Objeto a cargo del GUI (Vista)
     */
    public void setGUI(OcaGUI GUI) {
        this.GUI = GUI;
    }

    /**
     * Asocia al objeto a cargo de la lógica del juego con este coordinador
     *
     * @param juego Objeto a cargo de la lógica del juego (Modelo)
     */
    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    /**
     *<p>Asocia a una variable el método getTurno de Juego 
     *Emplea la variable encargada de asignar los siguientes turnos</p>
     *@see  OcaGUI#sigTurno(int)  
     */
    public void inicia() {
        int turnoInicio = juego.getTurno();
        GUI.sigTurno(turnoInicio);
    }

    /**
     *<p>La instancia juego invoca a su método juega()<br>
     * Recoge los valores de la posiciòn del tablero,valor del dado y turno a través de la instancia juego<br>
     * Estos valores se pasan como parámetros a la instancia de OcaGUI para sus métodos.<br>
     * Controla el fin del juego y despues cambia el turno.</p>
     * @see Juego#juega() 
     * @see Juego#ultimaPosicionTablero() 
     * @see Juego#ultimoValorDado()
     * @see Juego#getTurno() 
     * @see OcaGUI#setValorDado(int, int) 
     * @see OcaGUI#setPosicionTablero(int, int)
     * @see Juego#esFin()
     * @see OcaGUI#setGanador(int) 
     * @see OcaGUI#sigTurno(int)
     * @see Juego#avanzaTurno() 
     */
    public void juega() {
        juego.juega();
        int posicionTablero = juego.ultimaPosicionTablero();
        int valorDado = juego.ultimoValorDado();
        int turno = juego.getTurno();
        GUI.setValorDado(turno, valorDado);
        GUI.setPosicionTablero(turno, posicionTablero);
        if (juego.esFin()) {
            GUI.setGanador(turno);
        } else {
            int sigTurno = juego.avanzaTurno();
            GUI.sigTurno(sigTurno);
        }
    }

}
