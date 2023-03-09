/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15Legislador;

/**
 *
 * @author samue
 */
public class Diputado extends Legislador {
    
    private int numeroAsiento;

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        
        return "Diputado";
    }

    @Override
    public String toString() {
        return super.toString()+ "Diputado{" + "numeroAsiento=" + numeroAsiento + '}';
    }
    
    
}
