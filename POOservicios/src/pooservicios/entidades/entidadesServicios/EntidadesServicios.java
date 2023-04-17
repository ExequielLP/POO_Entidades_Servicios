/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooservicios.entidades.entidadesServicios;

import java.util.Scanner;
import pooservicios.entidades.CuentaBancaria;

/**
 *
 * @author Usuario
 */
public class EntidadesServicios {
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
        Scanner leer = new Scanner(System.in);
        CuentaBancaria c=new CuentaBancaria();
        System.out.println("ingrese numero de cuenta por favor");
        c.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese numero de cliente por favor");
        c.setDniCliente(leer.nextInt());
        System.out.println("ingrese saldo saldo actual");
        c.setSaldoActual(leer.nextInt());
        return c;
    }
    public void  ingresarDinero(CuentaBancaria c){
        System.out.println("ingrese la cantidad de dinero a depositar");
      int deposito=leer.nextInt();
      c.setSaldoActual(deposito+c.getSaldoActual());
       
        
    }
    public int retirar(CuentaBancaria c){
        System.out.println("ingrese cantidad a retirar por favor");
        int deposito=leer.nextInt();
        c.setSaldoActual(c.getSaldoActual()-deposito);
    return c.getSaldoActual();
    }
    
    public void  extraccionRapida(CuentaBancaria c){
         
        System.out.println("ingrese monto a sacar(solo puede sacar un 20% De la cuenta)");
        int retiro=leer.nextInt();
        
        if (retiro<c.getSaldoActual()*0.20) {c.setSiOno(true); c.setSaldoActual(c.getSaldoActual()-retiro);
            
        }
        else {c.setSiOno(false); System.out.println("eso es mas que el 20% de tu cuenta capo");
        }
        System.out.println("validacion de transaccion "+c.getisSiOno());
        
    }
    
    public int consultarSaldo(CuentaBancaria c){
    
        
    return c.getSaldoActual();
    }
    
    public void ConsultarDatos(CuentaBancaria c){
        System.out.println( c.toString());
    
    }
}
