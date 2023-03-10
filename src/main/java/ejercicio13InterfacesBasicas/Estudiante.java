/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13InterfacesBasicas;

/**
 *
 * @author pablo
 */
public class Estudiante extends Persona {
    private String id;

    public Estudiante(String id, String nombre, String apellido, String nif, String Direccion) {
        super(nombre, apellido, nif, Direccion);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() +"Estudiante{" + "id=" + id + '}';
    }

    @Override
    public void identificate() {
        System.out.println("Eres un estudiante");
    }
    
    public void estudiaPoco(){
        
        System.out.println("Este alumno estudia poco");
    }
    
    
}
