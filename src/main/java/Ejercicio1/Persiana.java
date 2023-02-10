/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author pablo
 */
public class Persiana extends Ventana {

    
        //Atributos
        private String color;

    public Persiana(String color, String formaVentana) {
        super(formaVentana);
        this.color = color;
    }
    

    public Persiana() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Persiana{" + "color=" + color + '}';
    }
    
    
    
}
