/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jerarquiaVehiculos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculo ve1 = new Vehiculo( "65653453", "23555ER", "Honda", "CE1", "Blanco", 0, true);
        
        VehiculoElectrico vee1 = new VehiculoElectrico(1,2, "65653453", "23555ER", "Honda", "CE1", "Blanco", 0, true);
        VehiculoCombustion vec1 = new VehiculoCombustion(1234556, TipoCombustible.DIESEL_PLUS, "5675675", "23555ER", "Honda", "CE1", "Blanco", 0, true);
        
        List<Vehiculo> lista = new ArrayList<>();
        
        lista.add(ve1);
        lista.add(vec1);
        
         for (Vehiculo v :lista){
             
             
             System.out.println(v);
             
             v.arrancar();//Coge el arrancar de su clase(vehiculo)
             if(v instanceof VehiculoElectrico){
                 
                 ((VehiculoElectrico)v.cargarBateria());
             }
         }
        
        
        
    }
    
}
