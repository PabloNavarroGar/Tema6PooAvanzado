/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioHospital;

/**
 *
 * @author pablo
 */
public class Paciente extends Persona {
    
    private String numeroHistorial;

    public Paciente(String numeroHistorial, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.numeroHistorial = numeroHistorial;
    }

    public String getNumeroHistorial() {
        return numeroHistorial;
    }

    public void setNumeroHistorial(String numeroHistorial) {
        this.numeroHistorial = numeroHistorial;
    }

    @Override
    public String toString() {
        return "Paciente{" + "numeroHistorial=" + numeroHistorial + '}';
    }
    
    
    public void tomarMediciona(String medicina){
        System.out.println("Este paciente toma la "+medicina+ " como medicina");
        
    }
}
