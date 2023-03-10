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
public class Ventana {
    
    //atributosVetana
    
    private String formaVentana;
    private String colorVentana;
    private boolean estadoVetana;
 
    public Ventana(String formaVentana, String colorVentana, boolean estadoVetana) {
        this.formaVentana = formaVentana;
        this.colorVentana = colorVentana;
        this.estadoVetana = estadoVetana;
    }
    

    public Ventana() {
    }

    public String getColorVentana() {
        return colorVentana;
    }

    public void setColorVentana(String colorVentana) {
        this.colorVentana = colorVentana;
    }

    public String getFormaVentana() {
        return formaVentana;
    }

    public void setFormaVentana(String formaVentana) {
        this.formaVentana = formaVentana;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.formaVentana);
        hash = 53 * hash + Objects.hashCode(this.colorVentana);
        return hash;
    }

    public boolean isEstadoVetana() {
        return estadoVetana;
    }

    public void setEstadoVetana(boolean estadoVetana) {
        this.estadoVetana = estadoVetana;
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
        final Ventana other = (Ventana) obj;
        if (!Objects.equals(this.formaVentana, other.formaVentana)) {
            return false;
        }
        return Objects.equals(this.colorVentana, other.colorVentana);
    }

    
    @Override
    public String toString() {
        return "Ventana{" + "formaVentana=" + formaVentana + '}';
    }
    
    public  void abrir(){
        
        this.estadoVetana=true;
    }
    
    public  void cerrar(){
        
        this.estadoVetana=false;
    }
}
