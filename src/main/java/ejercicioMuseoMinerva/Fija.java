/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

/**
 *
 * @author samue
 */
public final class Fija extends Sala {
        private boolean estado;

    public Fija(boolean estado, String nombreSala, int codSala, Sensor sensor) {
        super(nombreSala, codSala, sensor);
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Fija{" + "estado=" + estado + '}';
    }

    
        
}
