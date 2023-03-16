/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioHospital;

/**
 *
 * @author pablo
 */
public abstract class Empleado extends Persona {

    //Atributos
    public Empleado(String numeroSeguridadSocial, double salario, String nombre, String apellidos, Nif nif) {
        super(nombre, apellidos,nif);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }
    
    private String numeroSeguridadSocial;
    private double salario;

   

    public Empleado() {
    }
    
    
    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Empleado{" + "numeroSeguridadSocial=" + numeroSeguridadSocial + ", salario=" + salario + '}';
    }
    
    public abstract double calcularIRPF();
        
        
    
    
}
