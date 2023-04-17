/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooservicios;

import pooservicios.entidades.CuentaBancaria;
import pooservicios.entidades.entidadesServicios.EntidadesServicios;

/**
 *
 * @author Usuario
 */
public class Ejer1BANCO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntidadesServicios es = new EntidadesServicios();
        CuentaBancaria cb = es.crearCuenta();
        es.ingresarDinero(cb);
        System.out.println("su saldo actual es de " + cb.getSaldoActual());
        es.retirar(cb);
        System.out.println("su saldo actual es de " + cb.getSaldoActual());

        es.extraccionRapida(cb);
        System.out.println("su saldo es $$" + es.consultarSaldo(cb));
        es.ConsultarDatos(cb);
}
}