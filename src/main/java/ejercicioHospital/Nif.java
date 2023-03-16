/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioHospital;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Objects;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 *
 * @author pablo
 */
public class Nif {
    
    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public Nif (LocalDate fechaCaducidad) {
        this.numero = RandomStringUtils.randomNumeric(8);
        this.letra = calcularLetra();
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Nif{" + "numero=" + numero + ", letra=" + letra + ", fechaCaducidad=" + fechaCaducidad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.numero);
        hash = 59 * hash + this.letra;
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
        final Nif other = (Nif) obj;
        if (this.letra != other.letra) {
            return false;
        }
        return Objects.equals(this.numero, other.numero);
    }
    
    
    public static char calcularLetra(){
        Random random = new Random();
        
        return (char)(random.nextInt(24)+('A'));
        
        
        
    }
    
    public  void renovar(LocalDate fechaRenovacion){
        
        LocalDate nuevafechaCaducidad = fechaRenovacion.plusYears(10);
        
        this.fechaCaducidad = nuevafechaCaducidad;
        
        
        
        
    }
    
    
}
