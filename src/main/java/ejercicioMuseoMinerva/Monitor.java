/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

/**
 *
 * @author samue
 */
public final class Monitor extends Empleado {
    
        private String codMonitor;

    public Monitor(String codMonitor, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.codMonitor = codMonitor;
    }

    public String getCodMonitor() {
        return codMonitor;
    }

    public void setCodMonitor(String codMonitor) {
        this.codMonitor = codMonitor;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n Monitor{" + "codMonitor=" + codMonitor + '}';
    }
        
}
