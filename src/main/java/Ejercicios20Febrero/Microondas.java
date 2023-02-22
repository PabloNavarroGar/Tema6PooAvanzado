/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios20Febrero;

/**
 *
 * @author samue
 */
public class Microondas extends Electrodomestico {

        //Atributos de clase hoja
        private String modelo;
        private boolean grill;
        private int potencia;

    public Microondas(boolean grill, int potencia,String modelo, String marca, String eficenciaEnergetica, int peso, String consumoVatios, int altura, int anchura, int largo) {
        super(marca, eficenciaEnergetica, peso, consumoVatios, altura, anchura, largo);
        this.modelo= modelo;
        this.grill = grill;
        this.potencia = potencia;
    }

    public Microondas() {
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    
    public boolean isGrill() {
        return grill;
    }

    public void setGrill(boolean grill) {
        this.grill = grill;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return  super.toString()+ "\n\tMicroondas{" + "grill=" + grill + ", potencia=" + potencia + ", modelo=" + modelo + '}';
    }
    
    
    
    
    
     @Override
    public void encender() {
        
         System.out.println("El microondas " + this.getModelo() + " esta encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El microondas " + this.getModelo() + " esta apagado");
    }
    
    //Metodo de la hija
    public void descongelar(){
         System.out.println("El microondas " + this.getModelo() + " esta descongelando un producto");
    }
    
     public void calentar(){
         System.out.println("El microondas " + this.getModelo() + " esta calentando un producto");
    }
     
     
      public void metodoMicroondas(){
        
        System.out.println("Este metodo es del microondas");
    }
    
}
