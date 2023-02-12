/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Casa;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author pablo
 */
public class Casa {
    
    private String color;
    private int numHabitaciones;
    private ArrayList<Puerta> puertas;
    private ArrayList<Ventana> ventanas;
    private ArrayList<Calefactor> calefactor;
    public Casa(String color, int numHabitaciones,Puerta puerta,Ventana ventana,Calefactor calefactor) {
        this.color = color;
        this.numHabitaciones = numHabitaciones;
        this.puertas = new ArrayList<>();
        this.ventanas = new ArrayList<>();
        ventanas.add(ventana);
        this.calefactor=new ArrayList<>();
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

    @Override
    public String toString() {
        return "Casa{" + "color=" + color + ", numHabitaciones=" + numHabitaciones + ", puertas=" + puertas + ", ventanas=" + ventanas + ", calefactor=" + calefactor.toString() + '}';
    }

    public ArrayList<Puerta> getPuertas() {
        return puertas;
    }

    public void setPuertas(ArrayList<Puerta> puertas) {
        this.puertas = puertas;
    }

    public ArrayList<Ventana> getVentanas() {
        return ventanas;
    }

    public void setVentanas(ArrayList<Ventana> ventanas) {
        this.ventanas = ventanas;
    }

    public ArrayList<Calefactor> getCalefactor() {
        return calefactor;
    }

    public void setCalefactor(ArrayList<Calefactor> calefactor) {
        this.calefactor = calefactor;
    }

   
   
    
    
    
    
    
    
}
