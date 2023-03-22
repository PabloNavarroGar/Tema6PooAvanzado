/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6CTiendaRopa;


import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author pablo
 */
public abstract class Libro extends Productos implements Comparable <Libro>{
    
    
    private final  String isbn;

    public Libro( int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.isbn = RandomStringUtils.randomNumeric(14);
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.isbn);
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
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }
    
    
    @Override
    public String toString() {
        return super.toString()+ "\n Libro{" + "isbn=" + isbn + '}';
    }
    
    @Override
    public int compareTo(Libro o) {
        return this.isbn.compareTo(o.isbn);
    }
    
    
    
}
