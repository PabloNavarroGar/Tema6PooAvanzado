/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciIniciacion;

/**
 *
 * @author pablo
 */
public class Fibonachi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numerofibo = devolverFibonachiRecursivo(11  );
        /*
        0---->0
        1----->1
        2----->1
        3----->2
        4---->3
        5---->5 suma 5 y 3, luego ese resultado mas el ultimo(5)
        6----->8
        7----> 13
        8----> 21
        9----->34
        10--->55
         */
        System.out.println(numerofibo);
        System.out.println("---------Fibonachi iterativo-----");
        devolverFibonachiIterativo(10);

  
    }

    public static int devolverFibonachiRecursivo(int n) {
        int numero = Math.abs(n);

        if (numero == 0) {

            return 0;

        } else if (numero == 1) {
            return 1;
        } else {

            return devolverFibonachiRecursivo(n - 1) + devolverFibonachiRecursivo(n - 2);
        }

    }

    public static void devolverFibonachiIterativo(int n) {
        int numero = Math.abs(n);
        int fib = 1;
        int fibPrevio = 1;
        for (int i = 0; i < numero; i++) {
            int aux = fib;
            fib += fibPrevio;
            fibPrevio = aux;

            System.out.println(fib);
        }

        
    }

}
