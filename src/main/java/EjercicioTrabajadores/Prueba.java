/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioTrabajadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author samue
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Jardinero j1 = new Jardinero(3, 1200, "Juan Palomo", "12345678Y", 56);
        Jardinero j2 = new Jardinero(1, 1200, "Ichiban Kasuga", "87654321Y", 41);
        Jardinero j3 = new Jardinero(7, 1200, "Nanba", "675345678Y", 43);
           Jardinero j4 = new Jardinero(5, 1200, "Lamba", "672345679Y", 43);
        List <Jardinero> jardineros = new ArrayList<>();
        jardineros.add(j1);
        jardineros.add(j2);
        jardineros.add(j3);
        jardineros.add(j4);
        //Para que se ordenee
        Collections.sort(jardineros);
        
        
        //Comparator<Jardinero> criterioAntiguedad = (p1, p2) -> Integer.compare(p1.getAntiguedad(), p2.getAntiguedad());
        
        
        for (Jardinero j : jardineros) {
            System.out.println(j.getNombre()+" tiene  "+  j.getAntiguedad()+" años de antiguedad");
        }
    }

}
