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
    private Sensor temperatura;
    private Sensor humedad;

    public Sala(String nombreSala, int codSala, Temperatura temperatura, Humedad humedad) {
        this.nombreSala = nombreSala;
        this.codSala = codSala;
        this.obras = new ArrayList<>();
        this.temperatura = temperatura;
        this.humedad = humedad;
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

    public void ponerObras(Obra o) {
        this.obras.add(o);

    }

    public void quitarObras(Obra o) {
        this.obras.add(o);

    }

    public Sensor getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Sensor temperatura) {
        this.temperatura = temperatura;
    }

    public Sensor getHumedad() {
        return humedad;
    }

    public void setHumedad(Sensor humedad) {
        this.humedad = humedad;
    }

    @Override
    public String toString() {
        return "Sala{" + "nombreSala=" + nombreSala + ", codSala=" + codSala + ", obras=" + obras + ", temperatura=" + temperatura + ", humedad=" + humedad + '}';
    }

    
    
}
