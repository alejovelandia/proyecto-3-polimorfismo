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
public class Patineta extends Vehiculo{
    
    private int largoTabla;

    public Patineta(int largoTabla, String marca, String modelo) {
        super(marca, modelo);
        this.largoTabla = largoTabla;
    }
    
    public void patinetaInfo(){
         System.out.println("clase Patineta"); 
    }

    public int getLargoTabla() {
        return largoTabla;
    }

    public void setLargoTabla(int largoTabla) {
        this.largoTabla = largoTabla;
    }
    
}
