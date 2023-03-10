/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8Azar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Azar dado = new Dado();
        Azar moneda = new Moneda();
//        moneda.lanzar();
//        dado.lanzar();
//        
        List<Azar> objetoAzar = new ArrayList<>();

        objetoAzar.add(dado);//Conversion implicita
        objetoAzar.add(moneda);//conversion implicita

        //Si quiero usar algo de un objeto en concreto e de usar un casting implicito
        //Convertir una instancia hija en una variable padre
        for (Azar a : objetoAzar) {
            //Solo puedo hacer metodo que sean comun a moneda y a dado
            System.out.println("Lanzamiento " + a.lanzar());

            // variable a eres un dado ?
            if(a instanceof Dado){
                //Al saber que es un dado ya me da acceso a tipo, me da a entender 
                ((Dado)a).metodoDado(); //Conversion explicita
            }
            
            if(a instanceof Moneda){
                //Al saber que es un dado ya me da acceso a tipo, me da a entender 
                ((Moneda)a).metodoMoneda();//Conversion explicita
            }
            
        }

    }

}
