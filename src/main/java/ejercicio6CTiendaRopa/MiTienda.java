/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6CTiendaRopa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author pablo
 */
public class MiTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo 2 produtos de cada tipo
        Ropa r1 = new Pantalon("XL", "Nike", 1, 12.50, 10, "Pantalo Nike de entrenamiento");
        Ropa r2 = new Pantalon("M", "Pumma", 2, 19.50, 10, "Pantalo Pumma de entrenamiento");
        Musica m1 = new Musica("Crazy lixx", 5, 12.44, 21, "Disco 1");
        Musica m2 = new Musica("Michael jackon", 5, 12.44, 21, "Thriller");
        Libro l1 = new LibroPapel(600, 3, 10.99, 10, "El archivo de las Tormentas de Brandon Sanderson");
        Libro l2 = new LibroDigital(576, 5, 14.99, 10, "La Casa del Dragon de RR Martin");
        //Crea una lista de productos y añade dos objetos de cada tipo de producto distinto (de los posibles) a la misma.
        List<Productos> listaProductos = new ArrayList<>();
        
        listaProductos.add(r1);
        listaProductos.add(r2);
        listaProductos.add(m1);
        listaProductos.add(m2);
        listaProductos.add(l1);
        listaProductos.add(l2);
        
        //Muestra los datos de los productos usando un foreach. 

        listaProductos.forEach(System.out::println);

        // Ordena la lista de productos según el precio, haciendo uso de <<Comparator>> y
        //una expresión lambda. Muestra la lista de productos ordenados por precio.
         Comparator<Productos> criterioPrecio = (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio());
         System.out.println(" Ordenandio Lista segun los precios");
        
            
          Collections.sort(listaProductos, criterioPrecio);
          
          listaProductos.forEach(System.out::println);
    }

}
