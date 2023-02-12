/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Casa;

/**
 *
 * @author samue
 */
public class VentanaAbatible extends Ventana {
    
    
    private boolean estado;

    public VentanaAbatible(boolean estado, String formaVentana, String colorVentana) {
        super(formaVentana, colorVentana);
        this.estado = estado;
    }

    public VentanaAbatible() {
    }
    
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString()+ "VentanaAbatible{" + "estado=" + estado + '}';
    }
    
   
}
