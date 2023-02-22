/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios20Febrero;

/**
 *
 * @author samue
 */
public class Frigorifico extends Electrodomestico {
    
    //Atribulos hija
    private String modelo;
    private Integer temperatura;

    public Frigorifico(String modelo, Integer temperatura, String marca, String eficenciaEnergetica, int peso, String consumoVatios, int altura, int anchura, int largo) {
        super(marca, eficenciaEnergetica, peso, consumoVatios, altura, anchura, largo);
        this.modelo = modelo;
        this.temperatura = temperatura;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n\tFrigorifico{" + "modelo=" + modelo + ", temperatura=" + temperatura + '}';
    }

    @Override
    public void encender() {
         System.out.println("El frigorifico " + this.getModelo() + " esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El frigorifico " + this.getModelo() + " esta apagado");
    }
    
      public void fijarTemperaturaVerduras(Integer temperatura){
        
        System.out.println("La temperatura de la zona de verduras se puesto a " +temperatura+" grados");
    }
      
      public void fijarTemperaturaFrigorifico(Integer temperatura){
        
        System.out.println("La temperatura de la nevera se puesto a " +temperatura+" grados");
    }
    
     public void metodoFrigorifico(){
        
        System.out.println("Este metodo es del frigorifico");
    }
}
