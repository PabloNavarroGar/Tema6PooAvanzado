/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Casa;

/**
 *
 * @author samue
 */
public class Persiana {
    private boolean estado;

    public Persiana(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    public void subirPersiana(){
        
        this.estado = true;
    }
    
    public void bajarPersiana(){
        
        this.estado=false;
    }
}
