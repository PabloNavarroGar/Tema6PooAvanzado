/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

import java.time.LocalDate;

/**
 *
 * @author samue
 */
public final class Temporal extends Sala {
    
    
     private LocalDate fechaInicio;
     private LocalDate fechaFin;

    public Temporal(LocalDate fechaInicio, LocalDate fechaFin, String nombreSala, int codSala, Temperatura temperatura, Humedad humedad) {
        super(nombreSala, codSala, temperatura, humedad);
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
        return super.toString() +"\nTemporal{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
     
     
}
