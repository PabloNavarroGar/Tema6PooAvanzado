/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1Casa;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author pablo
 */
public class MainVentanaAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VentanaAbstracta v1= new VAbatile(90, true);
        VentanaAbstracta v2= new Vcorredera(50, true);
        //Le meto el set con el hashset
        Set<VentanaAbstracta> conjuntoVentanas = new HashSet<>();
        conjuntoVentanas.add(v1);
        conjuntoVentanas.add(v2);
        
        //Al ser ventanas todas las recogo en V
        for (VentanaAbstracta v : conjuntoVentanas) {
            v.abrir(100);
        }
    }
    
}
