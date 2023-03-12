/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package EjercicioSetMapRepasoHuelga;

/**
 *
 * @author samue
 */
public record Pasajero1(String nombre, String apellido, String NIF, TipoPasajero tipo) implements Comparable<Pasajero1> {

    @Override
    public int compareTo(Pasajero1 o) {
        
        return this.nombre.compareToIgnoreCase(o.nombre());
    }

}
