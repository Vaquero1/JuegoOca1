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
public class CasillaDado  extends Casilla{
    
    public CasillaDado(int posicion) {
        super(posicion);
    }
    
   @Override
   public void posaFicha(Ficha ficha) {
        
    }
   
   public int getPosicion(){
       return posicion;
   }
   
   public void setPosicion(int posicion){
       this.posicion=posicion;
       
   }
}
