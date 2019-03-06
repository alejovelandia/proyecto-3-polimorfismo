/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linea3.polimorfismo;

/**
 *
 * @author ferch
 */
public abstract class Vehiculo implements VehiculoInterface{
    
     @Override
    public void imprimirInfo(){
         System.out.println("clase Vehiculo Padre");  
    }
    
    public void vehiculoInfo(){
         System.out.println("clase Vehiculo propio");  
    }
   
    
}
