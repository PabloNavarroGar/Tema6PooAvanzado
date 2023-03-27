/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacesGraficas;

import javax.swing.JFrame;

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
        JFrame ventanaPrincipal = new JFrame ("Apliacion");
        
        //Establecemos posicion y tamaño
        ventanaPrincipal.setBounds(250, 250, 800, 600);
        
        //Hacemios visibe la ventaa
        ventanaPrincipal.setVisible(true);
        
        //acion por defecto de pulsar el boton
        
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
