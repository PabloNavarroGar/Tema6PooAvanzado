/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculoAbstracto;

import jerarquiaVehiculos.*;

/**
 *
 * @author pablo
 */
public class VehiculoCombustion extends Vehiculo{
    
    
    private int capacidad;
    private TipoCombustible tipo;

    public VehiculoCombustion(int capacidad, TipoCombustible tipo, String bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public VehiculoCombustion() {
    }

    @Override
    public String toString() {
        return "VehiculoCombustion{" + "capacidad=" + capacidad + ", tipo=" + tipo + '}';
    }
    
    
    public void repostar(){
        
        System.out.println("El vehiculo " + this.getMatricula() + " esta repostando");
    }

    @Override
    public void arrancar(int numero) {
         System.out.println("El vehiculo " +this.getBastidor()+ " esta arrancado");
    }

    @Override
    public void apagar(int numero) {
         System.out.println("El vehiculo " +this.getBastidor()+ " esta apagado");
    }
    
    
    
}
