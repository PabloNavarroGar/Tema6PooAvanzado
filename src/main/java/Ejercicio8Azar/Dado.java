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
public class Dado extends Azar {

    public Dado() {
        super(6);
    }

    public Dado(int posibilidades) {
        super(posibilidades);
    }
    
    

//    @Override
//    public int lanzar() {
//
//        Random numeroAleatorio = new Random();
//
//        this.setPosibilidades(numeroAleatorio.nextInt(6) + 1);
//
//        if (getPosibilidades() == 1) {
//
//            System.out.println("Has sacado el 1");
//
//        } else if (getPosibilidades() == 2) {
//
//            System.out.println("Has sacado el 2");
//
//        } else if (getPosibilidades() == 3) {
//
//            System.out.println("Has sacado el 3");
//        } else if (getPosibilidades() == 4) {
//
//            System.out.println("Has sacado el 4");
//
//        } else if (getPosibilidades() == 5) {
//
//            System.out.println("Has sacado el 5");
//
//        } else if (getPosibilidades() == 6) {
//
//            System.out.println("Has sacado el 6");
//
//        }
//
//        return getPosibilidades();
//    }

    @Override
    public int lanzar() {
        //Debido que en el cosntructor le metimos 6, el origen es de 1
        return new Random().nextInt(1,this.getPosibilidades()+1);
    }
    
    public void metodoDado(){
        
        System.out.println("Este metodo es del dado");
    }
    

}
