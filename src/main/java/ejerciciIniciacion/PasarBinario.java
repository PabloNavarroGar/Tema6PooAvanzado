/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciIniciacion;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class PasarBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        decimalABinarioIterativo(5);
    }
    
     
    
    //Metodo par apasar de decimalBinario
    
    public static void decimalABinarioIterativo(int n){
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        while(n>=2){
            
            numeros.add(n%2);
            n /=2;
            
        }
        
        numeros.add(n%2);
        //Como el ejercicio de la pila, para que se ponga el ultimo primero en orden al reves
        //LIFO pero en binario
        for (int i = numeros.size()-1; i >= 0; i--) {
            System.out.print(numeros.get(i));
        }
         
        
        
        
        
    }
    
}
