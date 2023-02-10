/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author pablo
 */
public class Calefactor {
    private int temperatura;

    public Calefactor(int temperatura) {
        this.temperatura = temperatura;
        
        
    }

    public Calefactor() {
    }
    

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Calefactor{" + "temperatura=" + temperatura + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.temperatura;
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
        final Calefactor other = (Calefactor) obj;
        return this.temperatura == other.temperatura;
    }
    
   public void encender(){
       
       System.out.println("El calefactor esta encendido");
   }
   
    public void apagar(){
       
       System.out.println("El calefactor esta apagado");
   }
    
    
    public void fijarTemperatura(int temperatura){
        
        System.out.println("La temperatura se puerto a " +temperatura+" grados");
    }
    
}
