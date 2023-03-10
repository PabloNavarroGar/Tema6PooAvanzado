/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11Figuras;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Figuras> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(10, 12)); // Base=10 Altura=12
        figuras.add(new Triangulo(10, 5)); // Base=10 Altura=5
        figuras.add(new Romboide(15, 5)); // Base=15, Altura=5 
        for (Figuras f : figuras) {
            System.out.println("Área: " + f.calcularArea());
        }

    }

}
