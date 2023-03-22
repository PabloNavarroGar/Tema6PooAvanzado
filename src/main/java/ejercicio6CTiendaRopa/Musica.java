/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6CTiendaRopa;

/**
 *
 * @author pablo
 */
public final class Musica extends Productos {
    
    private String grupo;

    public Musica(String grupo, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Musica{" + "grupo=" + grupo + '}';
    }
    
    
}
