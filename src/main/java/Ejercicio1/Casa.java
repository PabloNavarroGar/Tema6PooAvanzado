/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.Objects;

/**
 *
 * @author pablo
 */
public class Casa {
    
    private String color;
    private int numHabitaciones;
    private Puerta puertas;
    private Ventana ventanas;
    private Calefactor calefactor;
    public Casa(String color, int numHabitaciones,Puerta puerta,Ventana ventana,Calefactor calefactor) {
        this.color = color;
        this.numHabitaciones = numHabitaciones;
        this.puertas = puerta;
        this.ventanas = ventana;
        this.calefactor=calefactor;
    }

    public Casa() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

   
   
    
    
    
    
    
    
}
