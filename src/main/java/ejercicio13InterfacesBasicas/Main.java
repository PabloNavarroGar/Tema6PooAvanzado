/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13InterfacesBasicas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        List<Persona> lista = new ArrayList<>();
        
        
        lista.add(new Estudiante("1", "Juan", "Palomo", "1", "Hola"));
        lista.add(new Titular(LocalDate.now(), "Reposteria", 
                "Javi", "Garcia", "5367834Y", "123"));
        
        lista.add(new Interino(LocalDate.MIN, LocalDate.MIN,"Matematicas", 
                "Manolo", "Escobar", "3745789R", "1234"));
        
        
        
        for(Persona persona : lista){
            persona.identificate();
            
        }
        
        for(Persona persona : lista){
            
            if(persona instanceof Interino){
                var tmp = ((Interino)persona).getFechaInicio();
                System.out.println(tmp);
                
            }
            
            if(persona instanceof Titular){
                var tmp = ((Titular)persona).getFechaJubilacion();
                System.out.println(tmp);
                
            }
            
            
            if(persona instanceof Estudiante){
                var tmp = ((Estudiante)persona).getId();
                System.out.println(tmp);
                
            }
            
            
            
        }
    }
    
}
