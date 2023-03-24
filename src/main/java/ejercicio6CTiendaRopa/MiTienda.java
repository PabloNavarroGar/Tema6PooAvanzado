/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6CTiendaRopa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
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
        // 
        //Creo 2 produtos de cada tipo

        Productos r1 = new Pantalon("XL", "Nike", 1, 12.50, 10, "Pantalo Nike de entrenamiento");
        Productos r2 = new Pantalon("M", "Pumma", 7, 19.50, 10, "Pantalo Pumma de entrenamiento");
        Productos m1 = new Musica("Crazy lixx", 9, 12.44, 21, "Disco 1");
        Productos m2 = new Musica("Michael jackon", 14, 12.44, 21, "Thriller");
        Productos l1 = new LibroPapel(600, 25, 10.99, 10, "El archivo de las Tormentas de Brandon Sanderson");
        Productos l3 = new LibroPapel(100, 6, 9.95, 10, "El Principito");
        Productos l2 = new LibroDigital(576, 5, 14.99, 10, "La Casa del Dragon de RR Martin");
        Productos l4 = new LibroDigital(250, 5, 14.99, 10, "Bandolero");
        Productos m3 = new Musica("Madonna", 45, 20.65, 21, "Grandes exito");

        //Objeto que no esta en la lista
        Productos l5 = new LibroDigital(457, 8, 14.99, 10, "La Casa del Dragon de RR Martin-Parte 2");
        //Crea una lista de productos y añade dos objetos de cada tipo de producto distinto (de los posibles) a la misma.
        List<Productos> listaProductos = new ArrayList<>();

        listaProductos.add(r1);
        listaProductos.add(r2);
        listaProductos.add(m1);
        listaProductos.add(m2);
        listaProductos.add(l1);
        listaProductos.add(l2);
        listaProductos.add(l4);
        listaProductos.add(l3);
        //Muestra los datos de los productos usando un foreach. 

        listaProductos.forEach(System.out::println);

        // Ordena la lista de productos según el precio, haciendo uso de <<Comparator>> y
        //una expresión lambda. Muestra la lista de productos ordenados por precio.
        Comparator<Productos> criterioPrecio = (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio());
        System.out.println(" ----------------Ordenandio Lista segun los precios-----------------");

        Collections.sort(listaProductos, criterioPrecio);

        listaProductos.forEach(System.out::println);
        //Ordena la lista de productos según el código, haciendo uso de <<Comparator>> y
        //una expresión lambda. Muestra la lista de productos ordenados por código.

        Comparator<Productos> criterioCodigo = (p1, p2) -> Integer.compare(p1.getCodigo(), p2.getCodigo());
        System.out.println(" ----------------Ordenandio Lista segun los precios-----------------");

        Collections.sort(listaProductos, criterioCodigo);

        listaProductos.forEach(System.out::println);

        //Realiza la búsqueda binaria, según su código, de algún producto que exista
        //dentro de la lista y otro que no exista, mostrando la posición que ocupa en la lista.
        // Creamos un int, y usamos Collections, binary search ty le pasamos por los parametros la lista, el objeto en cuestion (key) y un criterio
        //para que busque
        int posicion = Collections.binarySearch(listaProductos, r2, criterioCodigo);

        System.out.println("EL Producto esta en la posicion : " + posicion);

        posicion = Collections.binarySearch(listaProductos, m3, criterioCodigo);

        System.out.println("EL Producto esta en la posicion : " + posicion);

        //Recorre la lista de productos y guarda todos los libros en una lista de libros.
        //Para  meter los libros de la lista, creo otra lista, y hacer un for que vaya recorriendo los podrodctos y hacemos un
        //Instanceof llamando a Libro, y hacemos un casting explicito con el iterador del for
        List<Libro> listaLibros = new ArrayList<>();
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i) instanceof Libro) {
                listaLibros.add((Libro) listaProductos.get(i));
            }

        }
        System.out.println("-------------Listado de todos los libros que hay en la lista con el ITERATOR---------------");
        //Muestra los datos de la lista de libros usando un objeto Iterator. 
        Iterator<Libro> iterador = listaLibros.iterator();

        while (iterador.hasNext()) {
            Libro lib = iterador.next();
            System.out.println(lib);
        }

        //Ordena los libros según ISBN, haciendo uso de <<Comparable>>. Muestra la lista de libros ordenada. 
        System.out.println("-------Listado de todos los libros ordenados por su ISBN");
        Collections.sort(listaLibros);

        listaLibros.forEach(System.out::println);

        //Recorre de nuevo la lista de libros y en cada iteración, ejecuta enviar() o descargar() en función del tipo de libro.
        while (iterador.hasNext()) {
            Libro lib = iterador.next();
            if (lib instanceof LibroDigital) {
                ((LibroDigital) lib).descargar();//Casting explicito

            }

            if (lib instanceof LibroPapel) {
                ((LibroPapel) lib).enviar("Estepona");//Casting explicito

            }
        }

        //Utiliza el método contains(Object) sobre la lista de libros para comprobar si existe un libro o no existe.
        //Ternario para el uso de contains
        System.out.println(listaLibros.contains((Libro) l4) ? "\nEl libro está en la lista" : "\nEl libro no está en la lista");
        //---
        System.out.println(listaLibros.contains((Libro) l5) ? "\nEl libro está en la lista" : "\nEl libro no está en la lista\n");

        //Apartado 12 - Usando la lista de productos inicial, crea una nueva lista con todos los objetos que Se Envian.
        // Creo una lista de envios
        List<SeEnvia> listaEnvio = new ArrayList<>();
        for (Productos p : listaProductos) {
            if (p instanceof SeEnvia) {
                listaEnvio.add((SeEnvia) p);

            }
        }

        // Recorre la lista de objetos que Se Envian y llama al método de la interfaz.
        listaEnvio.forEach(p -> p.enviar("Estepona"));

        //Inventa un método abstracto en Libro que tenga comportamientos diferentes en las subclases. Implementa los métodos en las clases hijas.
        System.out.println("\nProbamos el método abstracto de los libros\n");
        listaLibros.forEach(l -> l.tapaLibro());
    }

}
