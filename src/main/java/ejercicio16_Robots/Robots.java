/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16_Robots;

/**
 *
 * @author samue
 */
public class Robots implements Comparable<Robots>{
    //Atributos de clase
    private int numeroSerie;
    private int porcentajeVida;

    public Robots(int numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.porcentajeVida = UtilidadesMetodos.numeroEnteroRandom(1, 100);
    }

    public Robots() {
    }
    
    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(int porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }

    @Override
    public String toString() {
        return "Robots{" + "numeroSerie=" + numeroSerie + ", porcentajeVida=" + porcentajeVida + '}';
    }

    @Override
    public int compareTo(Robots o) {
        return Integer.compare(numeroSerie, numeroSerie);
    }
    
    
}
