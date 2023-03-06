/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios20Febrero;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author samue
 */
public class EjercicioC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //creo 2 objetos de cada tipo
        Electrodomestico frigo1 = new Frigorifico("F1-A", 0, "EA", "A+", 150, "240W", 210, 130, 150);
        Electrodomestico frigo2 = new Frigorifico("F2-B", 0, "Balay", "A++", 170, "200W", 160, 100, 110);

        Electrodomestico micro1 = new Microondas(true, 800, "M1-A", "Xiaomi", "B", 25, "150W", 50, 80, 40);
        Electrodomestico micro2 = new Microondas(false, 700, "M2-B", "Siemens", "A+", 20, "100W", 50, 80, 40);

        List<Electrodomestico> objetoElectro = new ArrayList();

        objetoElectro.add(frigo1);
        objetoElectro.add(frigo2);
        objetoElectro.add(micro1);
        objetoElectro.add(micro2);

        //usando la clase encender en el instace of, llamo segun el tipo de electrodomestico
        //Poliformismo
        for (Electrodomestico e : objetoElectro) {

            //Conversion explicita, en encender, se que todos los electrodomesticos van a encenderse
            if (e instanceof Electrodomestico) {
                e.encender();
            }
            if (e instanceof Frigorifico) {
                ((Frigorifico) e).fijarTemperaturaFrigorifico(5);
            }

            if (e instanceof Frigorifico) {
                //Al saber que es un frigorifico ya me da acceso a tipo, me da a entender 
                ((Frigorifico) e).metodoFrigorifico();//Conversion explicita
            }
            if (e instanceof Microondas) {
                ((Microondas) e).descongelar();
            }

            if (e instanceof Microondas) {
                //Al saber que es un microondas ya me da acceso a tipo, me da a entender 
                ((Microondas) e).metodoMicroondas();//Conversion explicita
            }

        }

        System.out.println("Lista ordenada por sus pesos usando comparator");

        Comparator<Electrodomestico> criterioPeso = (p1, p2) -> Long.compare(p1.getPeso(), p2.getPeso());

        Collections.sort(objetoElectro, criterioPeso);
        //De menor a Mayor
        for (Electrodomestico e : objetoElectro) {

            System.out.println("El electrodomestico de "+ e.getMarca() + " Tiene un peso de " + e.getPeso() +" kilos ");
        }
    }

}
