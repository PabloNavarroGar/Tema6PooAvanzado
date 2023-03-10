/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13InterfacesBasicas;

/**
 *
 * @author pablo
 */
public abstract class Persona implements Identificable {
    //Ponemos abstract para que sea abstracta pura
    
    
     private String nombre;
     private String apellido;
     private String nif;
     private String Direccion;

    public Persona(String nombre, String apellido, String nif, String Direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", Direccion=" + Direccion + '}';
    }
    
    
}
