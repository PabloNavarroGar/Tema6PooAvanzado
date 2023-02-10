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
public class Puerta{
    
    
    //Atributos 
    private String color;
    private TipoPuerta tipo;

    public Puerta(String color, TipoPuerta tipo) {
        this.color = color;
        this.tipo = tipo;
    }

    public Puerta() {
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoPuerta getTipo() {
        return tipo;
    }

    public void setTipo(TipoPuerta tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.color);
        hash = 59 * hash + Objects.hashCode(this.tipo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Puerta other = (Puerta) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return this.tipo == other.tipo;
    }

    @Override
    public String toString() {
        return "Puerta{" + "color=" + color + ", tipo=" + tipo + '}';
    }
    
    public void abrir(){
        
        System.out.println("La puerta esta abierta");
        
    }
    
    public void cerrar(){
        
        System.out.println("La puerta esta cerrada");
        
    }
    
}
