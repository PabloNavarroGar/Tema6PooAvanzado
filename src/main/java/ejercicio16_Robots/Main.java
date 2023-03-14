/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16_Robots;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author samue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Robots> listaRobots = new ArrayList<>();

        //Creacion de los 20 robots
        for (int i = 0; i < 20; i++) {
            int numeroSerie = i + 1;
           
            listaRobots.add(new Robots(numeroSerie));
        }

        System.out.println("Lista hecha sin ordenar generada de los 20 robots creados");
        listaRobots.forEach(System.out::println);

        //Comparadores
        Comparator<Robots> criterioVida = (p1, p2) -> Long.compare(p1.getPorcentajeVida(), p2.getPorcentajeVida());//Long para ints
        Comparator<Robots> criterioSerie = (p1, p2) -> Long.compare(p1.getNumeroSerie(), p2.getNumeroSerie());//Long para ints

        System.out.println("-----Robots ordenados por su porcentaje de vida de menos a mas------");

        Collections.sort(listaRobots, criterioVida);

        listaRobots.forEach(System.out::println);

        System.out.println("Los robots que tiene mas del 50% de vida son: " + mediaVida());

        System.out.println("-----Robots ordenados por su porcentaje de vida------");

        Collections.sort(listaRobots, criterioVida);

        System.out.println("Número de serie de los tres robots con mayor porcentaje de vida:");
        for (int i = 0; i < 3; i++) {
            System.out.println(listaRobots.get(i).getNumeroSerie());
        }
        
        
         System.out.println("-----Robots ordenados por su numero de Serie------");

        Collections.sort(listaRobots, criterioSerie);

        listaRobots.forEach(System.out::println);
        
        
         Robots objetoBuscar = new Robots();
       

        objetoBuscar.setNumeroSerie(5);//Lista ordenada por nombre
        //Declaro int para la posicion
         int posicion = Collections.binarySearch(listaRobots, objetoBuscar);

        System.out.println("El robot esta en la posicion : " + posicion);
    }

    public static int mediaVida() {
        ArrayList<Robots> aux = new ArrayList<>();

        int cantidadRobotsMas50PorcVida = 0;
        for (Robots robot : aux) {
            if (robot.getPorcentajeVida() > 50) {
                cantidadRobotsMas50PorcVida++;
            } else {
                break;
            }

        }
        return cantidadRobotsMas50PorcVida;
    }

}
