/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooservicios.entidades;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private int dniCliente;
    private int saldoActual;
    private boolean siOno;

    public boolean getisSiOno() {
        return siOno;
    }

   

    public void setSiOno(boolean siOno) {
        this.siOno = siOno;
    }

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int dniCliente, int saldoActual, boolean siOno) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.siOno = siOno;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + ", siOno=" + siOno + '}';
    }

    

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
}
