/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioHospital;

import java.util.Objects;

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
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.numeroSeguridadSocial);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.numeroSeguridadSocial, other.numeroSeguridadSocial);
    }

    
    @Override
    public String toString() {
        return super.toString()+"\n Empleado{" + "numeroSeguridadSocial=" + numeroSeguridadSocial + ", salario=" + salario + '}';
    }
    
    public abstract double calcularIRPF();
        
        
    
    
}
