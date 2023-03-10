/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1Casa;

/**
 *
 * @author pablo
 */
public abstract class VentanaAbstracta {
    private boolean estado;
    //Una clase abstraca, no se pueden hacer objetos de esa clase
    //Solo podemos hacer la abatible o corredera, no ventana
    //Las Hijas deben implementar los metodos abstractos de la clase padre
    
    public VentanaAbstracta() {
    }

    public VentanaAbstracta(boolean estado) {
        this.estado = estado;
    }
    //Hay que meter ne el parametro algun dato
    public abstract void abrir(int numero);
    //Le estoy diciendo que estos 2 metodos, que sn abstractos
    public abstract void cerrar(int numero);

    @Override
    public String toString() {
        return "VentanaAbstracta{" + "estado=" + estado + '}';
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
