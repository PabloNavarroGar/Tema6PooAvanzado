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
public final class Interino extends Profesor implements Comparable <Interino> {
    //Cuidado que hay que pone el comparable hay que ponerle el interino
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Interino(LocalDate fechaInicio, LocalDate fechaFin, String especialidad, String nombre, String apellido, String nif, String Direccion) {
        super(especialidad, nombre, apellido, nif, Direccion);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInterino{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

    

    @Override
    public int compareTo(Interino o) {
        return this.fechaInicio.compareTo(o.fechaInicio);
    }

   

}
