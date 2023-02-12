/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Casa;

/**
 *
 * @author samue
 */
public class VentanaCorredera extends Ventana {
        //Atributo
        private boolean estado;
        private Persiana persiana;
        //Constructor

    public VentanaCorredera(boolean estado, Persiana persiana, String formaVentana, String colorVentana) {
        super(formaVentana, colorVentana);
        this.estado = estado;
        this.persiana = persiana;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }

    @Override
    public String toString() {
        return super.toString()+ "VentanaCorredera{" + "estado=" + estado + ", persiana=" + persiana + '}';
    }

        
  
    
 
        
}
