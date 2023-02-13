/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1Casa;

/**
 *
 * @author pablo
 */
public class VAbatile extends VentanaAbstracta {
    private int anguloApertura;

    public VAbatile(int anguloApertura, boolean estado) {
        super(estado);
        this.anguloApertura = anguloApertura;
    }

    public VAbatile() {
    }

    public int getAnguloApertura() {
        return anguloApertura;
    }

  

    @Override
    public String toString() {
        return "VAbatile{" + "anguloApertura=" + anguloApertura + '}';
    }
    
    
   

    @Override
    public void abrir(int numero) {
        //Hay que indiciar que esta abierta y ademas los grados de apertura
        //Se calcula dividiendo entre 2
        this.setEstado(true);
        this.anguloApertura =(numero/2);
    }

    @Override
    public void cerrar(int numero) {
        //No lleva nada
    }

    public void setAnguloApertura(int anguloApertura) {
        this.anguloApertura = anguloApertura;
    }
    
    
    
}
