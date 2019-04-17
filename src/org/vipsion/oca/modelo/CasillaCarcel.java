/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vipsion.oca.modelo;

/**
 *
 * @author pisko
 */
public class CasillaCarcel extends Casilla{
    
    public CasillaCarcel(int posicion) {
        super(posicion);
    }
    
        public void posaFicha(Ficha ficha) {
            int turnosextra=-3;
        ficha.setPosicion(turnosextra);
    }
        
}
