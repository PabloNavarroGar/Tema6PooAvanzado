/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio15Legislador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samue
 */
public class PruebaLeguislador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creado Legisladores
        
        Legislador legis1 = new Diputado(1, "Estepona", "Vox", "Santiago", "Pagascal");
        Legislador legis2 = new Diputado(2, "Estepona", "Psoe", "Perro", "Sanche");
        Legislador legis3 = new Diputado(3, "Estepona", "PP", "Ayuso", "Ayuso");
        
        Legislador legis4 = new Senador(100, "Marbella", "GIL", "Jesus", "Gil Gil");
        Legislador legis5 = new Senador(150, "Marbella", "Psoe", "Bernal", "García");
        Legislador legis6 = new Senador(200,"Marbella", "PP", "Isabel", "Pantoja");
        
        //Voy a crear una lista para meterlos adentro
        
        List<Legislador> politicos = new ArrayList<>();
        
        politicos.add(legis1);
        politicos.add(legis2);
        politicos.add(legis3);
        politicos.add(legis4);
        politicos.add(legis5);
        politicos.add(legis6);
        
        politicos.forEach(System.out::println);
        
        //Voy a llamar a los metodos
        
        for(Legislador legislador : politicos){
            
            if(legislador instanceof Legislador ){
                System.out.println(" El Legistador "+legislador.getNombre()+" " +legislador.getApellidos() +  " es un  " +((Legislador) legislador).getCamaraEnQueTrabaja());
            }
            
            
        }
    }
    
}
