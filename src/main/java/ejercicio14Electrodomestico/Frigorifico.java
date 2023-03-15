/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14Electrodomestico;

/**
 *
 * @author pablo
 */
public class Frigorifico extends Electrodomestico implements Silencioso {
    
    private int capacidad;

    public Frigorifico(int capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFrigorifico{" + "capacidad=" + capacidad + '}';
    }

    @Override
    public void silencio() {
        System.out.println("Este frigorifico emite 50dB");
    }
    
}
