/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

/**
 *
 * @author samue
 */
public abstract  class Conservadores extends Empleado {
    
    private String idConservador;

    public Conservadores(String idConservador, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.idConservador = idConservador;
    }

    public String getIdConservador() {
        return idConservador;
    }

    public void setIdConservador(String idConservador) {
        this.idConservador = idConservador;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nConservadores{" + "idConservador=" + idConservador + '}';
    }
    
    
    
}
