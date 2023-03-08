/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio12CuentaCorriente;

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
        
        //Creo la cuenta y los clientes
        Persona p1 = new Persona("Pablo", "Palomo", "123456789Y");
        Cuenta c1 = new cuentaCorriente(50, 360, p1);
        
        
        System.out.println(c1);
    }
    
}
