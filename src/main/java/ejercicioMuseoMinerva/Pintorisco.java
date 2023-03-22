/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

/**
 *
 * @author samue
 */
public class Pintorisco extends Empleado implements Restaurar {
    private boolean estado;

    public Pintorisco(boolean estado, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.estado = estado;
    }
    
  

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString()+" \n Pintorisco{" + "estado=" + estado + '}';
    }

    @Override
    public void restaurarUnaObra(Obra o) {
               //Explictia
         if (o instanceof Cuadro) {
         
            System.out.println("El cuadro del autor " + ((Cuadro) o).getAutor()+ " ha sido restaurada.");
        } else {
            System.out.println("No es la especialidad del restaurador, prueba con otro.");
        }
    }
    
    
    
}
