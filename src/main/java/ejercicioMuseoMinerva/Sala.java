/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

import java.util.ArrayList;

/**
 *
 * @author samue
 */
public abstract class Sala {
    
    //Atributos
    private String nombreSala;
    private int codSala;
    private ArrayList<Obra> obras;
    private Sensor sensor;

    public Sala(String nombreSala, int codSala, Sensor sensor) {
        this.nombreSala = nombreSala;
        this.codSala = codSala;
        this.obras = new ArrayList<>();
        this.sensor = sensor;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public int getCodSala() {
        return codSala;
    }

    public void setCodSala(int codSala) {
        this.codSala = codSala;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "Sala{" + "nombreSala=" + nombreSala + ", codSala=" + codSala + ", obras=" + obras + ", sensor=" + sensor + '}';
    }
    
    public void ponerObras(Obra o){
        this.obras.add(o);
        
        
        
    }
    
    public void quitarObras(Obra o){
        this.obras.add(o);
        
        
        
    }
    
    
}
