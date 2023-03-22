/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

/**
 *
 * @author samue
 */
public class Escultorico extends Conservadores implements Restaurar {
    
    private boolean estado;

    public Escultorico(boolean estado, String idConservador, String nombre, String apellidos) {
        super(idConservador, nombre, apellidos);
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
        return super.toString()+ "\n Escultorico{" + "estado=" + estado + '}';
    }

    @Override
    public void restaurarUnaObra(Obra o) {
            //Explictia
         if (o instanceof Estatua) {
         
            System.out.println("La estatua " + ((Estatua) o).getNombre()+ " ha sido restaurada.");
        } else {
            System.out.println("No es la especialidad del restaurador, prueba con otro.");
        }
    }

 
    
    
}
