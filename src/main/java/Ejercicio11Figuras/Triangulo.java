/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11Figuras;

/**
 *
 * @author pablo
 */
public class Triangulo extends Figuras {
    
    
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        
        double area = getBase()*getAltura()/2;
        
        return area;
    }
    
}
