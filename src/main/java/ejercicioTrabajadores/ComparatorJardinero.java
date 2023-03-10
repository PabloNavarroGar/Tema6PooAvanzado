/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTrabajadores;

import java.util.Comparator;

/**
 *
 * @author samue
 */
public class ComparatorJardinero implements Comparator<Jardinero> {

    @Override
    public int compare(Jardinero o1, Jardinero o2) {
        int nifComparator = o1.getNif().compareTo(o2.getNif());
        if (nifComparator != 0) {
            return nifComparator;
        } else {
            return o1.getAntiguedad() - o2.getAntiguedad();
        }
        
    }
    
}
