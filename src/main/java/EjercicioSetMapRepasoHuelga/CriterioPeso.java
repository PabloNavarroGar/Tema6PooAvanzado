/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioSetMapRepasoHuelga;

import java.util.Comparator;

/**
 *
 * @author pablo
 */
public class CriterioPeso implements Comparator<Silla> {

  //Le soy comparator y saldra la interfaz para sleccionar los obetos

    @Override
    public int compare(Silla o1, Silla o2) {
        return Integer.compare(o1.peso,o2.peso);
    }
    //Cuando una clase implementa una interface la clase 
    //se vuelve un objeto de la interface
}
