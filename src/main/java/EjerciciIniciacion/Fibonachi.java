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
        System.out.println("--------Fibonacci Factorial------- ");
        int numerofibo = devolverFibonachiRecursivo(3 );
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
        System.out.println("---------Fibonacci iterativo-----");
        devolverFibonachiIterativo(6);

        System.out.println("Vico Fibo");
        
        int n = fiboTerativoVico(5);
        System.out.println(n);
  
    }

    public static int devolverFibonachiRecursivo(int n) {
        int numero = Math.abs(n);

       if(n<2){
           return n;
        } else {

            return devolverFibonachiRecursivo(n - 1) + devolverFibonachiRecursivo(n - 2);
        }

    }

    public static void devolverFibonachiIterativo(int n) {
        int numero = Math.abs(n);
        int fib = 1;
        int fibPrevio = 1;
        for (int i = 2; i < numero; i++) {
            int aux = fib;
            fib += fibPrevio;
            fibPrevio = aux;

            System.out.println(fib);
        }

        
    }
    
    public static int fiboTerativoVico(int n){
        int numero = Math.abs(n);
        int resultado =0;
        int n1 = 0;
        int n2 = 1;
        
        for (int i = 0; i < numero; i++) {
            resultado = n1 +2;
            n2=n1;
            n1=resultado;
        }
        
        return resultado;
    }

}
