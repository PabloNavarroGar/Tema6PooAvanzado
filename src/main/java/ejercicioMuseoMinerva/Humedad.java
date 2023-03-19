/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

/**
 *
 * @author samue
 */
public final class Humedad extends Sensor {

    
        private int humedad_MAX;
        private int humedad_MIN;

    public Humedad(int humedad_MAX, int humedad_MIN, int id) {
        super(id);
        this.humedad_MAX = humedad_MAX;
        this.humedad_MIN = humedad_MIN;
    }
        
        
        
   
    public int getHumedad_MAX() {
        return humedad_MAX;
    }

    public void setHumedad_MAX(int humedad_MAX) {
        this.humedad_MAX = humedad_MAX;
    }

    public int getHumedad_MIN() {
        return humedad_MIN;
    }

    public void setHumedad_MIN(int humedad_MIN) {
        this.humedad_MIN = humedad_MIN;
    }

    @Override
    public String toString() {
        return "Humedad{" + "humedad_MAX=" + humedad_MAX + ", humedad_MIN=" + humedad_MIN + '}';
    }
    
     @Override
    public void alarma() {
         System.out.println("HUMEDAD FUERA DE CONTROL!!!");
         
         
    }

    public void humedadMax(int humedad){
        
        if(humedad > this.humedad_MAX){
            alarma();
        }
        
    }
    
    public void humedadMin(int humedad){
        
        if(humedad < this.humedad_MIN){
            alarma();
        }
        
    }
    
}
