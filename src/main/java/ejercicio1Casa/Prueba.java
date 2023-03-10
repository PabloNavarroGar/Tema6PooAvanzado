/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1Casa;

import java.util.ArrayList;
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
        //Creo los objetos
        Ventana v1 = new Ventana("Cuadrada", "Blanca",true);
        Puerta p1 = new Puerta("Marron", TipoPuerta.PVC, false);
        Calefactor c1 = new Calefactor(21);
        //Creo la casa 
        Casa casita = new Casa("Azul", 1, p1, v1,c1);
        
        
        List<Casa> lista = new ArrayList<>();
        
        lista.add(casita);
        
        for(Casa c : lista){
            
            System.out.println(c);
        }
        
       
    }
    
    
    
}
