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
public class VehiculoElectrico  extends Vehiculo {
    //Hereda de vehiculo
    //###Con protectec se puede acceder desde el padre a atributos e la hija
        //Atributos de la clase hija
    
        private int numeroBateria;
        private int duracionCarga;
    //Constructor de la subclase, 

    public VehiculoElectrico(int numeroBateria, int duracionCarga, String bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.numeroBateria = numeroBateria;
        this.duracionCarga = duracionCarga;
    }

    public VehiculoElectrico() {
    }

    @Override
    public String toString() {
        return  super.toString()+ "Electrico" + "numeroBateria=" + numeroBateria + ", duracionCarga=" + duracionCarga + '}';
    }

    
    public void cargarBateria(){
        
        System.out.println("El vehiculo electrico con matricula "+getMatricula()+ "esta cargando");
    }
    
     public void cambiarBateria(){
        
        System.out.println("El vehiculo electrico con matricula "+getMatricula()+ "se le cambia la bateria ");
    }
   
    
    
    
    
}
