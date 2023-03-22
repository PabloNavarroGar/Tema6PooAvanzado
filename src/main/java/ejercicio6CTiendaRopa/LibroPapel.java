/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6CTiendaRopa;

/**
 *
 * @author pablo
 */
public class LibroPapel extends Libro implements SeEnvia {
    
    private int numeroPaginas;

    public LibroPapel(int numeroPaginas, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n LibroPapel{" + "numeroPaginas=" + numeroPaginas + '}';
    }

    @Override
    public void enviar(String direccion) {
        
        System.out.println(this.toString()+" y la direccion a la que se manda es "+ direccion);
    }
    
    
    
}
