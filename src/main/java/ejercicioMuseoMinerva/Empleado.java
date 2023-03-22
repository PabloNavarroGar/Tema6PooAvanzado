/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author samue
 */
public abstract class Empleado implements Comparable<Empleado> {

    //Atributos
    final private String nif;
    private String nombre;
    private String apellidos;

    public Empleado(String nombre, String apellidos) {
        this.nif = RandomStringUtils.randomNumeric(8) + RandomStringUtils.randomAlphabetic(1);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        return "Empleado{" + "nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }

    @Override
    public int compareTo(Empleado o) {
        return this.nif.compareToIgnoreCase(o.getNif());
    }

}
