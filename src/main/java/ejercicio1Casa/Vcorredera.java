/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1Casa;

/**
 *
 * @author pablo
 */
public class Vcorredera extends VentanaAbstracta {

    private int longApertura;

    public Vcorredera(int longApertura, boolean estado) {
        super(estado);
        this.longApertura = longApertura;
    }

    public Vcorredera() {
    }
    
    
    
    
    @Override
    public void abrir(int numero) {
        this.setEstado(true);
        this.longApertura=(numero/2);
    }

    @Override
    public void cerrar(int numero) {
    }

    public int getLongApertura() {
        return longApertura;
    }

    public void setLongApertura(int longApertura) {
        this.longApertura = longApertura;
    }
    
    
    
}
