/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1Casa;

import java.util.Objects;

/**
 *
 * @author pablo
 */
public class Puerta{
    
    
    //Atributos 
    private String color;
    private TipoPuerta tipo;
    private boolean estado;
    public Puerta(String color, TipoPuerta tipo,boolean estado) {
        this.color = color;
        this.tipo = tipo;
        this.estado = estado;
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
        
       this.estado = true;
        
    }
    
    public void cerrar(){
        
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
