package org.vipsion.oca;

import org.vipsion.oca.vista.OcaGUI;
import org.vipsion.oca.controlador.Coordinador;
import org.vipsion.oca.modelo.Juego;

/**
 *<p>Contiene las creaciones de Coordinador,Juego y OcaGUI</p> 
 * @since 0.5
 * @version 0.5
 * @author Vaquero
 * {@docRoot }
 */
public class Principal {

    /**
     * <p>A la instancia de Juego se le asigna una instancia coordinador<br>
    * A la instancia de OcaGUI se le asigna una instancia coordinador<br>
    * A la instacia de Coordinador se le asignan las instancias de OcaGUI y Juego.<br>
    * Se habilita la visibilidad de la interfaz gráfica<br>
    * </p>
    *
    * @author Vaquero
    * @see Juego
    * @see Coordinador
    * @see OcaGUI
    * @see Coordinador#inicia()
    * @param args <a href="https://users.dcc.uchile.cl/~lmateu/Java/Apuntes/hello.htm">No se utiliza</a>
    */
    public static void main(String[] args) {
        Coordinador miCoordinador = new Coordinador();
        Juego miJuego = new Juego();
        OcaGUI miGUI = new OcaGUI();
        miJuego.setCoordinador(miCoordinador);
        miGUI.setCoordinador(miCoordinador);
        miCoordinador.setGUI(miGUI);
        miCoordinador.setJuego(miJuego);
        miGUI.setVisible(true);
        miCoordinador.inicia();
    }
}
