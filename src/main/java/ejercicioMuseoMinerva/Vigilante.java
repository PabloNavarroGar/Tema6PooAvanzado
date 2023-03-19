/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

/**
 *
 * @author samue
 */
public final class Vigilante extends Empleado {
    
    
     private String codVigilante;

    public Vigilante(String codVigilante, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.codVigilante = codVigilante;
    }

    public String getCodVigilante() {
        return codVigilante;
    }

    public void setCodVigilante(String codVigilante) {
        this.codVigilante = codVigilante;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nVigilante{" + "codVigilante=" + codVigilante + '}';
    }
     
     
}
