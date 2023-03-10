/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioSetMapRepasoHuelga;

import java.util.Objects;

/**
 *
 * @author pablo
 */
public class Silla implements Comparable <Silla>{
    
    int peso;
    private String nombre;

    public Silla(int peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Silla{" + "peso=" + peso + ", nombre=" + nombre + '}';
    }
    
    //Equals --> HASCODE (Saber si dos objetos son iguales)
    
    
    //Comparar objetos para ordenarlos segun orden natural --> Comparable
    //TreeSet o TreeMap, o collections.sort con comparator

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nombre);
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
        final Silla other = (Silla) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    

    @Override
    public int compareTo(Silla o) {
         return this.nombre.compareTo(o.getNombre());
        
        //return Integer.compare(peso, peso);
    }
    
    
}
