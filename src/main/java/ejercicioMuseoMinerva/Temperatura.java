/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

/**
 *
 * @author samue
 */
public final class Temperatura extends Sensor {
    
    private int temperatura_MAX;
    private int temperatura_MIN;

    public Temperatura(int temperatura_MAX, int temperatura_MIN, int id) {
        super(id);
        this.temperatura_MAX = temperatura_MAX;
        this.temperatura_MIN = temperatura_MIN;
    }

    public int getTemperatura_MAX() {
        return temperatura_MAX;
    }

    public void setTemperatura_MAX(int temperatura_MAX) {
        this.temperatura_MAX = temperatura_MAX;
    }

    public int getTemperatura_MIN() {
        return temperatura_MIN;
    }

    public void setTemperatura_MIN(int temperatura_MIN) {
        this.temperatura_MIN = temperatura_MIN;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "temperatura_MAX=" + temperatura_MAX + ", temperatura_MIN=" + temperatura_MIN + '}';
    }

    @Override
    public void alarma() {
        System.out.println("TEMPERATURA FUERA DE CONTROL");
    }
    
     public void temp_Max(int tmp){
        
        if(tmp > this.temperatura_MAX){
            alarma();
        }
        
    }
    
    public void temp_Min(int tmp){
        
        if(tmp < this.temperatura_MIN){
            alarma();
        }
        
    }
    
}
