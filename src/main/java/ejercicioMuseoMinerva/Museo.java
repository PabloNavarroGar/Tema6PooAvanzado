/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioMuseoMinerva;

import java.util.ArrayList;

/**
 *
 * @author samue
 */
public class Museo {
    
    private String nombre;
    private String Direccion;
    
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Sala> listaSalas;

    public Museo(String nombre, String Direccion) {
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.listaEmpleados = new ArrayList<>();
        this.listaSalas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Sala> getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(ArrayList<Sala> listaSalas) {
        this.listaSalas = listaSalas;
    }

    @Override
    public String toString() {
        return "Museo{" + "nombre=" + nombre + ", Direccion=" + Direccion + ", listaEmpleados=" + listaEmpleados + ", listaSalas=" + listaSalas + '}';
    }
    
    
    public  void contratarEmpleado(Empleado e){
        
        this.listaEmpleados.add(e);
        
    }
    
    public  void despedirEmpleado(Empleado e){
        
        this.listaEmpleados.remove(e);
        
        
    }
    
    public void anadirSala(Sala s){
        this.listaSalas.add(s);
        
        
    }
    
    public void quitarSala(Sala s){
        
        this.listaSalas.remove(s);
        
    }
    
}
