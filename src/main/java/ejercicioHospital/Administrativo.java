/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioHospital;

/**
 *
 * @author pablo
 */
public class Administrativo extends Empleado {

    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.grupo = grupo;
    }

    public Administrativo() {
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "grupo=" + grupo + '}';
    }

    @Override
    public double calcularIRPF() {

        if (this.grupo.equals('C')) {
            return this.getSalario() - (this.getSalario() * this.grupo.getIrpf());

        } else if (this.grupo.equals('D')) {
            return this.getSalario() - (this.getSalario() * this.grupo.getIrpf());
        } else {

            return this.getSalario() - (this.getSalario() * this.grupo.getIrpf());
        }

    }

    public void registrarDocumento() {

        System.out.println("El administrativo " + this.getNombre() + " esta registrando un documento");
    }
}
