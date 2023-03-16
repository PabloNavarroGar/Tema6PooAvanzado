/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioHospital;

import java.time.LocalDate;

/**
 *
 * @author pablo
 */
public abstract class Persona {
    //Atributos
    
    private String nombre;
    private String apellidos;
    protected Nif nif ;

    public Persona(String nombre, String apellidos,Nif nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    public Persona() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + '}';
    }
    
    
    public void  renovarNif(LocalDate fechaSolicitud){
        
        
       //Para llamar a un metodo de otra clase por composicion para renova rel nif
       // tengo que llamarlos con el this, su atributo y invocar el metodo
         this.nif.renovar(fechaSolicitud);
        
    }
}
