/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8Azar;

import java.util.Random;

/**
 *
 * @author pablo
 */
public class Moneda extends Azar {

    public Moneda() {
        super(2);
    }

//    @Override
//    public int lanzar() {
//
//        Random numeroAleatorio = new Random();
//
//        this.posibilidades = numeroAleatorio.nextInt(2) + 1;
//
//        if (posibilidades == 1) {
//
//            System.out.println("Has sacado cara");
//
//        } else {
//
//            System.out.println("Has sacado cruz");
//
//        }
//
//        return posibilidades;
//    }

    @Override
    public int lanzar() {
        
        return new Random().nextInt(1,this.getPosibilidades()+1);
    }

     public void metodoMoneda(){
        
        System.out.println("Este metodo es de la moneda");
    }
}
