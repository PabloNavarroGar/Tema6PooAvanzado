/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioHospital;

import java.util.Random;

/**
 *
 * @author pablo
 */
public class Paciente extends Persona implements Natacion {
    
    private String numeroHistorial;

    public Paciente(String numeroHistorial, String nombre, String apellidos,Nif nif) {
        super(nombre, apellidos,nif);
        this.numeroHistorial = numeroHistorial;
    }

   

    public Paciente() {
    }

    
    

    public String getNumeroHistorial() {
        return numeroHistorial;
    }

    public void setNumeroHistorial(String numeroHistorial) {
        this.numeroHistorial = numeroHistorial;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nPaciente{" + "numeroHistorial=" + numeroHistorial + '}';
    }
    
    
    public  void tomarMediciona(String medicina){
        
        Random random = new Random();
        boolean curado = random.nextBoolean();
        if (curado) {
            System.out.println("El paciente se ha curado al tomar la medicina "+medicina );
        } else {
            System.out.println("El paciente no se ha curado al tomar la medicina " +medicina);
        }
        
    }

    @Override
    public void nadar() {
        
            System.out.println("Soy un paciente y estoy nadando");
    }
}
