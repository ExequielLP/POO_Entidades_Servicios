/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooserviciosejer3;

import entidades.Persona;
import servicios.PersonaServicio;

/**
 *
 * @author Usuario
 */
public class POOserviciosEJER3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio sv = new PersonaServicio();
        Persona p1=sv.crearPersona();
        System.out.println("el resutlado de el calcula masa corporal es "+sv.calcularIMC(p1));
        System.out.println("es mayor de edad: "+sv.esMayorDeEdad(p1));
        Persona p2=sv.crearPersona();
        System.out.println("el resutlado de el calcula masa corporal es "+sv.calcularIMC(p2));
         System.out.println("es mayor de edad: "+sv.esMayorDeEdad(p2));
          Persona p3=sv.crearPersona();
          System.out.println("el resutlado de el calcula masa corporal es "+sv.calcularIMC(p3));
         System.out.println("es mayor de edad: "+sv.esMayorDeEdad(p3));
          Persona p4=sv.crearPersona();
         System.out.println("el resutlado de el calcula masa corporal es "+sv.calcularIMC(p4));
         System.out.println("es mayor de edad: "+sv.esMayorDeEdad(p4));
        
       
    }
    
}
