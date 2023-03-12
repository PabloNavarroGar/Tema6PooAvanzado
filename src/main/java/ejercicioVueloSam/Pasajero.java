/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package ejercicioVueloSam;

/**
 *
 * @author samue
 */
public record Pasajero(String nombre, String apellido, String NIF, TipoPasajero tipo) implements Comparable<Pasajero> {

     @Override
    public int compareTo(Pasajero o) {
        return this.nombre.compareToIgnoreCase(o.nombre());
    }
}
