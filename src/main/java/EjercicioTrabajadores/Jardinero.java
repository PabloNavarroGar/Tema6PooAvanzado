/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioTrabajadores;

/**
 *
 * @author samue
 */
public class Jardinero extends Empleado  {
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
    //Es un casting, convierto o en Jardinero para acceder a antiguedad
    //Mediante este metodo, puedo acceder con la mas alta de la jerarquia,
    //Si quiero algo en concreto, como es este caso la antiguedad, tengo que hacerle
    //el casting
    
    public int compareTo(Persona o) {
        return Integer.compare(this.antiguedad, ((Jardinero)o).antiguedad);
    }

    @Override
    public void aumentarSalario(double plus) {
        double incentivo = 0.4;
        this.setSalario(getSalario()*incentivo);
    }
    
    
}
