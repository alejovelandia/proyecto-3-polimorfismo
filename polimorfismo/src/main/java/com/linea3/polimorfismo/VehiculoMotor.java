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
public abstract class VehiculoMotor extends Vehiculo{
    
    private String tipoCombustible;

    public VehiculoMotor(String tipoCombustible, String marca, String modelo) {
        super(marca, modelo);
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public void imprimirInfo(){
        System.out.println("clase VehiculoMotor padre");  
    }
    
    public void motorInfo(){
         System.out.println("clase vehiculoMotor Propia"); 
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
}
