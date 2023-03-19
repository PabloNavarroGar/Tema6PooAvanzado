/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

/**
 *
 * @author samue
 */
public class Estatua extends Obra {

    private EpocasObras tipoObra;

    private String material;

    private String nombre;

    public Estatua(EpocasObras tipoObra, String material, String nombre, String autor) {
        super(autor);
        this.tipoObra = tipoObra;
        this.material = material;
        this.nombre = nombre;
    }

    public EpocasObras getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(EpocasObras tipoObra) {
        this.tipoObra = tipoObra;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n Estatua{" + "tipoObra=" + tipoObra + ", material=" + material + ", nombre=" + nombre + '}';
    }
    
    
}
