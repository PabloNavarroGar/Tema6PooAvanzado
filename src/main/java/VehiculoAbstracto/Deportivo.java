/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculoAbstracto;

import jerarquiaVehiculos.*;

/**
 *
 * @author carlos
 */
public class Deportivo extends Vehiculo {
    //Deportivo extiende de la clase Vehiculo, se va a añadir cosas al vehiculo
    //De ahi el Extends
    private int cilindrada; // Atributo específico para Deportivo
    //LOS CONSTRUCTORES NO SE HEREDAN
    //El constructor de la clase hija debe llaman a la clase padre
    //Creo el contructor seleccionado al padre, y e añado la cilindrada
    public Deportivo(int cilindrada, Long bastidor, String matricula, 
            String marca, String modelo, String color, double tarifa, 
            boolean disponible) {
        //Lamada al constructor de vehiculo
        //super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        //Inicializado el constructor de atrivutos de la clase
        this.cilindrada = cilindrada;
    }
    
    public Deportivo(){
        //Implicitamente llama a super(); Constructor sin parametros superclase
        //Puedo usar esto para hacer busquedas binarias
        cilindrada = 4;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tDeportivo{" + "cilindrada=" + cilindrada + '}';
    }
//    
//    @Override
//    public String toString() {
//        return "Deportivo = {"+ this.getBastidor()+" , "+ this.getMatricula()+ "  , "+ this.cilindrada+"}" ;
//    }


    public void metodoDeportivo(){
        System.out.println("Este método es de la clase Deportivo");
    }

    @Override
    public void arrancar(int numero) {
        this.setEstado(true);
        this.cilindrada = (numero/2);
    }

    @Override
    public void apagar(int numero) {
    }
}
