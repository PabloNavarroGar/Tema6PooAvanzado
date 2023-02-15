/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioTrabajadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        Jardinero j2 = new Jardinero(2, 1200, "Ichiban Kasuga", "87654321Y", 41);
        Jardinero j3 = new Jardinero(5, 1200, "Nanba", "675345678Y", 43);
        List<Jardinero> jardineros = new ArrayList<>();
        jardineros.add(j1);
        jardineros.add(j2);
        jardineros.add(j3);
        Collections.sort(jardineros, new ComparatorJardinero());
        for (Jardinero j : jardineros) {
            System.out.println(j.getNombre() + " (" + j.getNif() + ", " + j.getAntiguedad() + " años)");
        }
    }

}
