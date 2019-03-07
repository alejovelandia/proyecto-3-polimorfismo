/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linea3.polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class Menu {

    public void Imprimir() {

        List<Vehiculo> listaVehiculo = new ArrayList<>();
       
        Vehiculo v1 = new Patineta(50,"cgk","prior");
        Vehiculo v2 = new Patineta(65,"fly","element");
        
        Vehiculo v3 = new Avion((double)3.2,"diesel","boing","737");
        Vehiculo v4 = new Avion((double)6.3,"diesel","airbus","87");
        
        Vehiculo v5 = new Carro((double)5.3,"gasolina","ford","ranger");
        Vehiculo v6 = new Carro((double)2.4,"gasolina","coupe","basic");
        
        Vehiculo v7 = new Bicicleta(17,"GW","advance");
        Vehiculo v8 = new Bicicleta(8,"rhino","z");

        listaVehiculo.add(v1);
        listaVehiculo.add(v2);
        listaVehiculo.add(v3);
        listaVehiculo.add(v4);
        listaVehiculo.add(v5);
        listaVehiculo.add(v6);
        listaVehiculo.add(v7);
        listaVehiculo.add(v8);
        
     
        for (Vehiculo vehiculo : listaVehiculo) {

            System.out.println("-----------------------------------");
            if (vehiculo instanceof Bicicleta) {
               ((Bicicleta) vehiculo).bicicletaInfo();
                vehiculo.imprimirInfo();
            }
            if (vehiculo instanceof Patineta) {
                ((Patineta) vehiculo).patinetaInfo();
                vehiculo.imprimirInfo();
            }
            if (vehiculo instanceof Carro) {
                ((Carro) vehiculo).carroInfo();
                vehiculo.imprimirInfo();
            }
            if (vehiculo instanceof Avion) {
                ((Avion) vehiculo).avionInfo();
                vehiculo.imprimirInfo();
            }

        }
          
    }
}
