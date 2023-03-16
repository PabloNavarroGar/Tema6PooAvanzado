/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioHospital;

import static java.lang.Math.random;
import java.time.LocalDate;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author pablo
 */
public class MainHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion del Hospital
        Hospital h1 = new Hospital("Materno", "Calle Gongora", 120);
        //Probando metodos de las clases
        //Creacion de los 5 empleados 2 metidos y 3 administrativos y 5 pacientes
        Medico m1 = crearMedico();
        Medico m2 = crearMedico();
        Administrativo a1 = crearAdministrativo();
        Administrativo a2 = crearAdministrativo();
        Administrativo a3 = crearAdministrativo();
        Paciente p1 = crearPaciente();
        Paciente p2 = crearPaciente();
        Paciente p3 = crearPaciente();
        Paciente p4 = crearPaciente();
        Paciente p5 = crearPaciente();
        //Contratacion del hospital
        h1.contratarEmpleado(m1);
        h1.contratarEmpleado(m2);
        h1.contratarEmpleado(a1);
        h1.contratarEmpleado(a2);
        h1.contratarEmpleado(a3);
        h1.ingresarPaciente(p1);
        h1.ingresarPaciente(p2);
        h1.ingresarPaciente(p3);
        h1.ingresarPaciente(p4);
        h1.ingresarPaciente(p5);

        System.out.println(h1.getListaEmpleados());
        System.out.println(p1);
        System.out.println("Proando el metodo de medicina al un paciente");
        
        m1.tratarPaciente(p5, "Paracetamol");
        
       
        
        System.out.println("En total el irpf del doctor"+m1.getNombre()+"para de "+m1.getSalario()+"  a " +m1.calcularIRPF());
        
        System.out.println("En total el irpf del administratuvo"+a1.getNombre()+"para de "+a1.getSalario()+"  a " +a1.calcularIRPF());
        
        System.out.println("Renovando DNI");
        p1.renovarNif(LocalDate.now());
        
    }
    
    public static Paciente crearPaciente() {
        String numeroHistorial = RandomStringUtils.randomNumeric(6);
        String nombre = generarNombreAleatorio();
        String apellidos = generarApellidoAleatorio() + generarApellidoAleatorio();
        Paciente aux = new Paciente(numeroHistorial, nombre, apellidos, new Nif(LocalDate.now()));
        
        return aux;
        
    }
    
    public static Medico crearMedico() {
        String numeroHistorial = RandomStringUtils.randomAscii(6);
        String nombre = generarNombreAleatorio();
        String apellidos = generarApellidoAleatorio() + generarApellidoAleatorio();
        Medico aux = new Medico("Cirugia", numeroHistorial, 30000, nombre, apellidos, new Nif(LocalDate.now()));
        
        return aux;
        
    }
    
    public static Administrativo crearAdministrativo() {
        String numeroHistorial = RandomStringUtils.randomNumeric(6);
        String nombre = generarNombreAleatorio();
        String apellidos = generarApellidoAleatorio() + generarApellidoAleatorio();
        Administrativo aux = new Administrativo(Grupo.C, numeroHistorial, 25000, nombre, apellidos, new Nif(LocalDate.now()));
        
        return aux;
        
    }
    
    public static String generarNombreAleatorio() {
        Random random = new Random();
        String[] nombres = {"Juan", "María", "Pedro", "Lucía", "Diego", "Valentina"};
        
        String nombre = nombres[random.nextInt(nombres.length)];
        
        return nombre;
    }
    
    public static String generarApellidoAleatorio() {
        Random random = new Random();
        String[] apellidos = {"García", "Martínez", "Fernández", "Sánchez", "Pérez", "Rodríguez"};
        String apellido = apellidos[random.nextInt(apellidos.length)];
        
        return apellido;
    }
}
