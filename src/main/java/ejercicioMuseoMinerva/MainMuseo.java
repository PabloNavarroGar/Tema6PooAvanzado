/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioMuseoMinerva;

/**
 *
 * @author samue
 */
public class MainMuseo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Creamos el museo primero
        Museo m1 = new Museo("El Prado"," Calle del Arte 2023");
        //Creo 2 empleados de prueba
        Empleado e1 = new Monitor("123", "Pablo", "Palomo Palomo");
        Empleado e2 = new Vigilante("124", "Juan", "Sanchez");
        //Creo 2 obras
        Obra o1 = new Cuadro("Virgen del Canonico", EpocasObras.RENACENTISTA, "Van der Peile");
        Obra o2 = new Estatua(EpocasObras.ROMANTICISMO, "Marmol", "David De Miguel Angel", "Miguel Angel");
        
        //Creo la sala
        Sala s1 = new Fija(true, "Prueba", 1, new Temperatura(45, 8, 1));
        
        
        //Añado las obras a la Sala
        
        s1.ponerObras(o1);
        s1.ponerObras(o2);
        
        
        //Meto las salas en el museo y los empleados
        
        m1.contratarEmpleado(e1);
        m1.contratarEmpleado(e2);
        m1.anadirSala(s1);
        
        System.out.println(m1.toString());
        
    }
    
}
