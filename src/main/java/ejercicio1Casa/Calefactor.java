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
public class Calefactor {
    private Integer temperatura;

    public Calefactor(Integer temperatura) {
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
        return Objects.equals(this.temperatura, other.temperatura);
    }
    
   public void encender(){
       
       System.out.println("El calefactor esta encendido");
   }
   
    public void apagar(){
       
       System.out.println("El calefactor esta apagado");
   }
    
    
    public void fijarTemperatura(Integer temperatura){
        
        System.out.println("La temperatura se puerto a " +temperatura+" grados");
    }
    
}
