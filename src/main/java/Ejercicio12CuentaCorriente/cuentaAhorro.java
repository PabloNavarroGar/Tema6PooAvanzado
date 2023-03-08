/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12CuentaCorriente;

/**
 *
 * @author samue
 */
public class cuentaAhorro extends Cuenta {
    
    private double interes;
    private double comisionAnual;

    public cuentaAhorro(double interes, double comisionAnual, double saldo, Persona cliente) {
        super( saldo, cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        return super.toString()+"cuentaAhorro{" + "interes=" + interes + ", comisionAnual=" + comisionAnual + '}';
    }

    @Override
    public void actualizarSaldo() {
        
        double saldo = (getSaldo()+(getSaldo()*this.interes))- this.comisionAnual;
    }

    @Override
    public void retirar(double cantidad) {
         cantidad = Math.abs(cantidad);

        if (getSaldo() < cantidad) {

        } else {
            //Hay que poner el resto de la cantida en este sitio
            setSaldo(getSaldo() - cantidad);

        }
    }
    
    
}
