/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

import java.util.Comparator;

/**
 *
 * @author samue
 */
public class Comparable implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {

        int nifComparator = o1.getNif().compareTo(o2.getNif());

        return nifComparator;

    }

}
