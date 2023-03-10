/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14Electrodomestico;

/**
 *
 * @author pablo
 */
public class Microondas extends Electrodomestico implements Silencioso {
    
    
    private int potenciaMaxima;

    public Microondas(int potenciaMaxima, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMaxima = potenciaMaxima;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    @Override
    public String toString() {
        return  super.toString() +"\nMicroondas{" + "potenciaMaxima=" + potenciaMaxima + '}';
    }

    @Override
    public void silencio() {
        System.out.println("Este microondas emite 40dB");
    }
    
    
}
