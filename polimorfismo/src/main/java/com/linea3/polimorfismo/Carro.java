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
public class Carro extends VehiculoMotor{
    
    private double tamañoMotor;

    public Carro(double tamañoMotor, String tipoCombustible, String marca, String modelo) {
        super(tipoCombustible, marca, modelo);
        this.tamañoMotor = tamañoMotor;
    }
    
    public void carroInfo(){
         System.out.println("clase Carro"); 
    }

    public double getTamañoMotor() {
        return tamañoMotor;
    }

    public void setTamañoMotor(double tamañoMotor) {
        this.tamañoMotor = tamañoMotor;
    }
   
}
