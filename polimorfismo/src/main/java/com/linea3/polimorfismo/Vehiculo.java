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
    
    
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
     @Override
    public void imprimirInfo(){
         System.out.println("clase Vehiculo Padre");  
    }
    
    public void vehiculoInfo(){
         System.out.println("clase Vehiculo propio");  
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
   
    
}
