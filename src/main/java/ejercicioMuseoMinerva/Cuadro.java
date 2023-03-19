/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

/**
 *
 * @author samue
 */
public class Cuadro extends Obra {
    
    private String nombreCuadro;
    private EpocasObras tipoObra;

    public Cuadro(String nombreCuadro, EpocasObras tipoObra, String autor) {
        super(autor);
        this.nombreCuadro = nombreCuadro;
        this.tipoObra = tipoObra;
    }

    public String getNombreCuadro() {
        return nombreCuadro;
    }

    public void setNombreCuadro(String nombreCuadro) {
        this.nombreCuadro = nombreCuadro;
    }

    public EpocasObras getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(EpocasObras tipoObra) {
        this.tipoObra = tipoObra;
    }

    @Override
    public String toString() {
        return super.toString()+" \nCuadro{" + "nombreCuadro=" + nombreCuadro + ", tipoObra=" + tipoObra + '}';
    }
    
    
}
