/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios20Febrero;

import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class EjercicioA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
         String numero;
        do {
            numero = JOptionPane.showInputDialog("Introduce un número entero:");
        } while (!esNumero(numero));
        //Convertimos los numeros en un chatarray
        char[] numeros = numero.toCharArray();
        //Compruebo con los indices en inicio el array el sitio 0, y luego pongo el length-1 que se va al ultimo lugar
        if (esCapicua(numeros, 0, numeros.length - 1)) {
            JOptionPane.showMessageDialog(null, "El número es capicúa");
        } else {
            JOptionPane.showMessageDialog(null, "El número no es capicúa");
        }
        
    }
    
    
     /*Lee un número por teclado usando JOption. Si no es un número, se debe leer de nuevo.
    Convierte el número leído a un array de char.
      Implementa un método recursivo para saber si el array de char contiene un número capicúa.*/
    
   
    
    
        

//Ver los dos indices, solucion mas sencilla
        //Otra solucon posible que es mas facil
//           for (int i = 0; i < array.length/2; i++) {

//            array[i] != array[array.length-i-1]
//            return false;
//        }
        
        private static boolean esNumero(String numero) {
        try {
            //Parse de string a int
            Integer.parseInt(numero);
            //No se un numero pues sale la expecion
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
        
        private static boolean esCapicua(char[] numeros, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        } else if (numeros[inicio] != numeros[fin]) {
            return false;
        } else {
            return esCapicua(numeros, inicio + 1, fin - 1);
        }
    }
        
    /* En cada recurtsiva si se comprueba si el número en el índice inicio es igual 
        al número en el índice fin. Si no son iguales, el método devuelve false.
        Si son iguales, se llama al método de nuevo pero con los índices inicio y
        fin ajustados para examinar el siguiente par de números. Si inicio es 
        mayor o igual a fin, entonces se han examinado todos los pares de números y el método devuelve true.*/

}
