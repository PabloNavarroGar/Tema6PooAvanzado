/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expresionesRegularesEjemplos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pablo
 */
public class ExpresionesPrueba {

    /**
     * @param args the command line arguments
     *
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //A.Detector N,S,E,O
        //Introducir un texto y detectar la posicion en la que se 
        //encuentra la letra,
        //indicando los puntos cardinales(norte,sur,este y oeste).

        //B.En cualquier String, buscar si esta contenido,en alguna posicion,
        // que este la palabra 'ini', '2 numeros' y 'fin'
        //C.Que cumpla que una letra con numero tantas veces como se quiera
        //ej:a7b5c9z;
        //Creo  la expresión regular.
        String regex = "al : [N|S|E|O]";
        // Creamos nuestro texto que si contendrá el patrón buscado.
        String txt = "En andalucia Malaga esta al : S y Granada al : E, Cadiz al : O de Malaga";
        //  Compilamos el patrón a buscar
        Pattern pat = Pattern.compile(regex);
        //  Creamos un buscador de patrones en el texto
        Matcher matcher = pat.matcher(txt);
        //   Imprimimo todos los patrones encontrados en el texto
        while (matcher.find()) {
            //Bucle que vaya encontrando los patrones
            System.out.println("Patrón encontrado: " + matcher.group());
        }

        String regex2 = "ini[0-9]{2}fin";

        String txt2 = "rigithiorthrtb,rmgbmrtmfini13finhkrithkriothomrtgmrg";

        Pattern pat2 = Pattern.compile(regex2);

        Matcher matcher2 = pat2.matcher(txt2);
        //El patron esta metido entre todas esas letras
        while (matcher2.find()) {

            System.out.println("Patrón encontrado: " + matcher2.group());
        }

        /*----- EJERCICIO 3 -----*/
        
        String regex3 = "[a-z|A-Z]{1}[0-9]{1}";
        
        String txt3 = "a4L5wefwefweghi5K3";
        
        Pattern pat3 = Pattern.compile(regex3);
       
        Matcher matcher3 = pat3.matcher(txt3);
       
        while (matcher3.find()) {

            System.out.println("Patrón encontrado: " + matcher3.group());
        }

    }

}
