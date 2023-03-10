/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1Casa;

/**
 *
 * @author samue
 */
public class VentanaCorredera extends Ventana {
        //Atributo
      
        private Persiana persiana;
        //Constructor

    public VentanaCorredera(Persiana persiana, String formaVentana, String colorVentana, boolean estadoVetana) {
        super(formaVentana, colorVentana, estadoVetana);
        this.persiana = persiana;
    }

    

   

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }

    @Override
    public String toString() {
        return super.toString()+ "VentanaCorredera{+ persiana=" + persiana + '}';
    }

        
  
    
 
        
}
