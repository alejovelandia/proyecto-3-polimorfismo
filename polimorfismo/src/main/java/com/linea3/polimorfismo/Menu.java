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
        List<VehiculoMotor> listaVehiculoMotor= new ArrayList<>();
        
        Vehiculo v1 = new Patineta();
        Vehiculo v2 = new VehiculoMotor();
        Vehiculo v3 = new Avion();
        Vehiculo v4 = new Carro();
        Vehiculo v5 = new Bicicleta();

        listaVehiculo.add(v1);
        listaVehiculo.add(v2);
        listaVehiculo.add(v3);
        listaVehiculo.add(v4);
        listaVehiculo.add(v5);
        
        VehiculoMotor v6=new Carro();
        VehiculoMotor v7=new Avion();
        
        listaVehiculoMotor.add(v6);
        listaVehiculoMotor.add(v7);
        

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
            if (vehiculo instanceof VehiculoMotor) {
                ((VehiculoMotor) vehiculo).motorInfo();
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
        
        for (VehiculoMotor vehiculoMotor : listaVehiculoMotor) {

            System.out.println("-----------------------------------");
            if (vehiculoMotor instanceof Carro) {
               ((Carro) vehiculoMotor).carroInfo();
                vehiculoMotor.imprimirInfo();
            }
            
            if (vehiculoMotor instanceof Avion) {
                ((Avion) vehiculoMotor).avionInfo();
                vehiculoMotor.imprimirInfo();
            }
        }
        
    }
}
