/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13InterfacesBasicas;

import java.time.LocalDate;

/**
 *
 * @author pablo
 */
public class Titular extends Profesor {
    private LocalDate fechaJubilacion;

    public Titular(LocalDate fechaJubilacion, String especialidad, String nombre, String apellido, String nif, String Direccion) {
        super(especialidad, nombre, apellido, nif, Direccion);
        this.fechaJubilacion = fechaJubilacion;
    }

    public LocalDate getFechaJubilacion() {
        return fechaJubilacion;
    }

    public void setFechaJubilacion(LocalDate fechaJubilacion) {
        this.fechaJubilacion = fechaJubilacion;
    }

    @Override
    public String toString() {
        return "Titular{" + "fechaJubilacion=" + fechaJubilacion + '}';
    }
    
    
}
