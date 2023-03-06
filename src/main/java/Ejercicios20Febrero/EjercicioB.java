/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios20Febrero;

import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class EjercicioB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = JOptionPane.showInputDialog("Introduce una frase");
        System.out.println("La frase introducida es: " + frase);
        System.out.println("El tamaño de la frase es: " + frase.length());

        // índice de la primera ocurrencia del carácter 'a'
        int indice = obtenerIndiceCaracter(frase, 'a');
        System.out.println("El índice de la primera 'a' es: " + indice);
        // posiciones del carácter 'm' en el String
        int[] posiciones = obtenerPosicionesDeCaracter(frase, 'm');
        System.out.print("Las posiciones de la 'm' son: ");
        for (int posicion : posiciones) {
            System.out.print(posicion + " ");
        }
        System.out.println();

        // recorremos el String y mostramos información sobre cada carácter
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);//Declaro un char para las letras
            System.out.print("El carácter " + c + " tiene valor Unicode " + (int) c);
            //Uso de la clase Character, por si es mayuscula
            if (Character.isUpperCase(c)) {
                System.out.println(" y es una letra mayúscula");
            } else if (Character.isLowerCase(c)) {
                System.out.println(" y es una letra minúscula");
            } else if (Character.isDigit(c)) {
                System.out.println(" y es un dígito");
            } else {
                System.out.println(" y es un carácter especial");
            }
        }

        // eliminamos los espacios en blanco de la cadena y mostramos la nueva cadena y su tamaño
        String nuevaFrase = frase.replaceAll(" ", "");
        System.out.println("La nueva frase sin espacios en blanco es: " + nuevaFrase);
        System.out.println("El tamaño de la nueva frase es: " + nuevaFrase.length());

    }

    public static int obtenerIndiceCaracter(String cadena, char caracter) {
        return cadena.indexOf(caracter);//Uso indexOf
    }

    public static int[] obtenerPosicionesDeCaracter(String cadena, char caracter) {
        int[] posiciones = new int[cadena.length()];
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                posiciones[contador] = i;
                contador++;
                //Contado de que vaya anotando los caracter
            }
        }
        //Posiciones finales, creo un array con las posicioes finales 
        // le meto el contador, que ha ido contando los caracteres
        int[] posicionesFinales = new int[contador];
        for (int i = 0; i < contador; i++) {
            posicionesFinales[i] = posiciones[i];
        }
        return posicionesFinales;
    }
}
