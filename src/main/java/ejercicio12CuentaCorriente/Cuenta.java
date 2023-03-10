/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12CuentaCorriente;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author samue
 */
public abstract class Cuenta {
    
    //Atributos de clase
    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta( double saldo, Persona cliente) {
        this.numeroCuenta = generarCuenta();
        this.saldo = 0;
        this.cliente = cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    
      //GENERAR UN NUMERO DE CUENTA ALEATORIO, Privado ya que solo se va a usar en esta clase
    private  String generarCuenta() {
        String cuenta = RandomStringUtils.randomNumeric(20);

        return cuenta;

    }
    
    public abstract  void actualizarSaldo();
    
    public abstract void retirar(double cantidad);
    
}
