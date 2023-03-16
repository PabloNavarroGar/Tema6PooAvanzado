/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioHospital;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Hospital {

    //Atributos
    private String nombre;

    private String direccion;

    private int numeroCamas;

    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Paciente> listaPacientes;

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.listaEmpleados = new ArrayList<>();
        //Para introducir listas em clases, se llaman en los objetivos, se crea y en el constructor se inicia
        this.listaPacientes = new ArrayList<>();
    }

    public void contratarEmpleado(Empleado e) {

        this.listaEmpleados.add(e);

    }

    public void ingresarPaciente(Paciente p) {
        this.listaPacientes.add(p);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

}
