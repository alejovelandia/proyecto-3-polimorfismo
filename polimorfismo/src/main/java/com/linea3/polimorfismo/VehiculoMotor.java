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
public class VehiculoMotor extends Vehiculo{
    
    @Override
    public void imprimirInfo(){
        System.out.println("clase VehiculoMotor padre");  
    }
    
    public void motorInfo(){
         System.out.println("clase vehiculoMotor Propia"); 
    }
}
