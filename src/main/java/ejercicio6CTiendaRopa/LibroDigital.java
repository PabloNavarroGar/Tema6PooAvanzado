/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6CTiendaRopa;

/**
 *
 * @author pablo
 */
public class LibroDigital extends Libro implements SeDescarga{
    
      private double numKBytes;

    public LibroDigital(double numKBytes, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.numKBytes = numKBytes;
    }

    public double getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(double numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n LibroDigital{" + "numKBytes=" + numKBytes + '}';
    }

    @Override
    public void descargar() {
    
        System.out.println("http://pablo.daw/hashcode");
           
        
    }
      
      
      
    
}
