/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14Electrodomestico;

/**
 *
 * @author pablo
 */
public class CampanaExtractora extends Electrodomestico implements Silencioso{
    
    
        private int decibelios;

    public CampanaExtractora(int decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        if(decibelios >50){
        this.decibelios = decibelios;
        }
    }

    public int getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(int decibelios) {
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        return "CampanaExtractora{" + "decibelios=" + decibelios + '}';
    }

    @Override
    public void silencio() {
    }

   
        
        
        
}
