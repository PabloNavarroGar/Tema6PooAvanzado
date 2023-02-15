/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioTrabajadores;

/**
 *
 * @author samue
 */
public class Jardinero extends Empleado implements Comparable<Persona> {
    //atributo
    
    private int antiguedad;

    public Jardinero(int antiguedad, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return  super.toString()+ "Jardinero{" + "antiguedad=" + antiguedad + '}';
    }

   

    @Override
    public int compareTo(Persona o) {
         return this.getNif().compareToIgnoreCase(o.getNif());
    }
    
}
