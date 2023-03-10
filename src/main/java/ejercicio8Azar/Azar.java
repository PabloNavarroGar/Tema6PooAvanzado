/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8Azar;

/**
 *
 * @author pablo
 */
public abstract class Azar {

    private int posibilidades;

    public Azar(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    public abstract int lanzar();

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }

}
