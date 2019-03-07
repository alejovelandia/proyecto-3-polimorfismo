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
public class Bicicleta extends Vehiculo{
    
    private int conteoEngranaje;

    public Bicicleta(int conteoEngranaje, String marca, String modelo) {
        super(marca, modelo);
        this.conteoEngranaje = conteoEngranaje;
    }
    
    public void bicicletaInfo(){
         System.out.println("clase Bicicleta"); 
    }

    public int getConteoEngranaje() {
        return conteoEngranaje;
    }

    public void setConteoEngranaje(int conteoEngranaje) {
        this.conteoEngranaje = conteoEngranaje;
    }
    
}
