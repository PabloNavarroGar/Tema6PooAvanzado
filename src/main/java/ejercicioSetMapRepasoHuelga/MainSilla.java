/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioSetMapRepasoHuelga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author pablo
 */
public class MainSilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Silla,Integer> map = new HashMap<>();
        
        Silla s1 = new Silla(40, "SecretLab");
        Silla s2 = new Silla(45, "Marcus");
        Silla s3 = new Silla(20, "Carrefour");
        Silla s4 = new Silla(35, "Lidl");
        Silla s5 = new Silla(15, "Office");
        System.out.println("Listado del map sin ordenar");
       
        map.put(s5, 1);
        map.put(s2,2);
        map.put(s4,3);
        map.put(s3,4);
        
        for (Map.Entry<Silla, Integer> entry: map.entrySet()) {
            Silla key = entry.getKey();
            Integer val = entry.getValue();
            
            System.out.println("Key: "+ key+ "\t Value: "+ val);
        }
        
        
        Map<Silla,Integer> almacen = new TreeMap<>();
        
        System.out.println("Listado del treemap ordenado");
        
        almacen.put(s5, 1);
        almacen.put(s2,2);
        almacen.put(s4,3);
         almacen.put(s3,4);
        for (Silla key : almacen.keySet()) {
            System.out.printf("Clave %s -- Objeto %s %n", key, almacen.get(key));
        }
        
        //Ordenacion, pilla el comparable que le hemos puesto nombre
        
        List<Silla> listaSillas = new ArrayList<>();
        
        listaSillas.add(s1);
        listaSillas.add(s2);
        listaSillas.add(s3);
        listaSillas.add(s4);
        listaSillas.add(s5);
        
        System.out.println("Lista de sillas segun el orden de su inserccion");
        
        listaSillas.forEach(s->System.out.println("Nombre : "+ s.getNombre()));
        
        
        
        System.out.println("Lista de sillas segun el orden de su orden natural");
        Collections.sort(listaSillas);
        listaSillas.forEach(s->System.out.println("Nombre : "+ s.getNombre()));
        
        System.out.println("Lista de sillas segun peso");
        CriterioPeso criterio = new CriterioPeso();
        //La variable criterio es de tipo CriterioPeso,Objetct,Comparator
        Collections.sort(listaSillas,criterio);
        listaSillas.forEach(s->System.out.println("Peso:"+ s.getPeso()+" Nombre : "+ s.getNombre()));
        
        
        
        System.out.println("Creando el criterio");
       
        //La variable criterio es de tipo CriterioPeso,Objetct,Comparator
        Collections.sort(listaSillas,new Comparator<Silla>(){
            @Override
            public int compare(Silla o1, Silla o2) {
                 return Integer.compare(o1.peso,o2.peso);
            }
           
            
         
        });
        
        
        Collections.sort(listaSillas, (si1,si2)-> Integer.compare(si1.peso, si2.peso));
        
        listaSillas.forEach(System.out::println);
        
    }
    
}
