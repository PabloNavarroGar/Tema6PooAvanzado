/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12CuentaCorriente;

/**
 *
 * @author samue
 */
public class cuentaCorriente extends Cuenta {

    //Atributos de la clase 
    private double interes;
    private double saldoMin;

    //Constructor
    public cuentaCorriente(double saldoMin, double saldo, Persona cliente) {
        super(saldo, cliente);
        this.interes = 1.5;
        this.saldoMin = 50;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        return super.toString() + "cuentaCorriente{" + "interes=" + interes + ", saldoMin=" + saldoMin + '}';
    }

    @Override
    public void actualizarSaldo() {

        if (super.getSaldo() > 1000) {

            super.setSaldo(super.getSaldo() + (super.getSaldo() * this.interes));
        } else {
            super.setSaldo(super.getSaldo() + (super.getSaldo() * this.interes));

        }

    }

    @Override
    public void retirar(double cantidad) {

        cantidad = Math.abs(cantidad);

        if (this.getSaldo() < this.saldoMin) {
            System.out.println("No se puede retirar dinero porque es menor al saldo");

        } else {
            //Hay que poner el resto de la cantida en este sitio
            //cuenta.setSaldo(cuenta.getSaldo() - cantidad);
            setSaldo(getSaldo() - cantidad);

        }
    }
}
