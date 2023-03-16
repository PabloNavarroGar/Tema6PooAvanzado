/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioHospital;

/**
 *
 * @author pablo
 */
public class Medico extends Empleado implements Natacion {

    private String especialidad;

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos,Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos,nif );
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString()+" \nMedico{" + "especialidad=" + especialidad + '}';
    }

    @Override
    public double calcularIRPF() {
        double degradacion;
        //Para calcular el IRPF de un médico hay que saber que si su especialidad es cirugía, 
        //se aplica un 25% sobre el salario. En caso de ser otra especialidad el IRPF que se aplica es un 23.5%.
        if (this.especialidad.equalsIgnoreCase("cirugia")) {

            degradacion = this.getSalario() - (this.getSalario() * 0.25);
        } else {

            degradacion = this.getSalario() - (this.getSalario() * 0.235);

        }

        return degradacion;

    }

    public void tratarPaciente(Paciente paciente, String medicina) {

        System.out.println("El médico " + this.getNombre() +" de la consulta de "+this.getEspecialidad()+ " trata al paciente "
                + paciente.getNombre() + " con la medicina " + medicina);

        paciente.tomarMediciona(medicina);

    }

    @Override
    public void nadar() {
        System.out.println("Soy un medico y estoy nadando");
    }
}
