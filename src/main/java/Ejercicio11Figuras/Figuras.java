/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11Figuras;

/**
 *
 * @author pablo
 */
public abstract class Figuras {
    //Atributos de clase
    
    private double base;
    
    private double altura;

    public Figuras(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Figuras{" + "base=" + base + ", altura=" + altura + '}';
    }
    //Metodo abstracto
    public abstract  double  calcularArea();
    
}
