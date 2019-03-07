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
public class Avion extends VehiculoMotor{
    
    private double modeloMotor;

    public Avion(double modeloMotor, String tipoCombustible, String marca, String modelo) {
        super(tipoCombustible, marca, modelo);
        this.modeloMotor = modeloMotor;
    }
    
    public void avionInfo(){
         System.out.println("clase Avion"); 
    }

    public double getModeloMotor() {
        return modeloMotor;
    }

    public void setModeloMotor(double modeloMotor) {
        this.modeloMotor = modeloMotor;
    }
    
}
