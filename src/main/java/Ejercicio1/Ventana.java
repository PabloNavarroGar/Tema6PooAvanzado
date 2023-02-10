/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author pablo
 */
public class Ventana {
    
    //atributosVetana
    
    private String formaVentana;

    public Ventana(String formaVentana) {
        this.formaVentana = formaVentana;
    }

    public Ventana() {
    }

    public String getFormaVentana() {
        return formaVentana;
    }

    public void setFormaVentana(String formaVentana) {
        this.formaVentana = formaVentana;
    }

    @Override
    public String toString() {
        return "Ventana{" + "formaVentana=" + formaVentana + '}';
    }
    
    
    
    
}
