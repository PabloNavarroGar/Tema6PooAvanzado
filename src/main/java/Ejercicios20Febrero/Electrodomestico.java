/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios20Febrero;

/**
 *
 * @author samue
 */
public abstract class Electrodomestico implements Comparable<Electrodomestico> {
    //Atributos de la clase padre
    
    private String marca;
    private String eficenciaEnergetica;
    private int peso;
    private String consumoVatios;
    private int altura;//en centimetros las medidas
    private int anchura;
    private int largo;

    public Electrodomestico(String marca, String eficenciaEnergetica, int peso, String consumoVatios, int altura, int anchura, int largo) {
        this.marca = marca;
        this.eficenciaEnergetica = eficenciaEnergetica;
        this.peso = peso;
        this.consumoVatios = consumoVatios;
        this.altura = altura;
        this.anchura = anchura;
        this.largo = largo;
    }

    public Electrodomestico() {
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEficenciaEnergetica() {
        return eficenciaEnergetica;
    }

    public void setEficenciaEnergetica(String eficenciaEnergetica) {
        this.eficenciaEnergetica = eficenciaEnergetica;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getConsumoVatios() {
        return consumoVatios;
    }

    public void setConsumoVatios(String consumoVatios) {
        this.consumoVatios = consumoVatios;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Electrodomestico{");
        sb.append("marca=").append(marca);
        sb.append(", eficenciaEnergetica=").append(eficenciaEnergetica);
        sb.append(", peso=").append(peso);
        sb.append(", consumoVatios=").append(consumoVatios);
        sb.append(", altura=").append(altura);
        sb.append(", anchura=").append(anchura);
        sb.append(", largo=").append(largo);
        sb.append('}');
        return sb.toString();
    }
    
    
    public abstract  void encender();
    
    public abstract  void apagar();
    
     @Override
    public int compareTo(Electrodomestico o) {
        return Integer.compare(peso, peso);
    }
   
}
