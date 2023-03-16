/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioHospital;

/**
 *
 * @author pablo
 */
public class Administrativo extends Empleado {
    
    
    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos) {
        super(numeroSeguridadSocial, salario, nombre, apellidos);
        this.grupo = grupo;
    }
    
    

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "grupo=" + grupo + '}';
    }
    
    @Override
    public double calcularIRPF() {
        double degradacion
        
    }
    
    public void registrarDocumento(String nombreDoc){
        
        System.out.println("Entrga un documento llamado "+ nombreDoc);
    }
}
