/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * aun no la llame en el main
 */
public class PersonaServicio {

    Persona p = new Persona();
    Scanner leer = new Scanner(System.in);

    public boolean esMayorDeEdad(Persona p) {
        boolean maOme = false;
        if (p.getEdad() > 18) {
            maOme = true;

        }

        return maOme;
    }

    public Persona crearPersona() {
        int salida = 1;
        System.out.println("ingrese su nombre");
        p.setNombre(leer.next());
        System.out.println("ingrese su edad");
        p.setEdad(leer.nextInt());
        System.out.println("ingrese su sexo con H(hombre) , M(mujer) u O(otro)");
        
        do {
            p.setSexo(leer.next());

            if (p.getSexo().equalsIgnoreCase("h") || p.getSexo().equalsIgnoreCase("m") || p.getSexo().equalsIgnoreCase("o")) {
                salida = 2;

            } else {
                System.out.println("letra incorrecta, por favor ingrese H,M u O");
            }
        } while (salida == 1);

        System.out.println("ingrese su peso");
        p.setPeso(leer.nextInt());
        System.out.println("ingrese su altura ");
       p.setAltura(leer.nextDouble());

        return p;
    }
    
    public double calcularIMC (Persona c){
    double res=0;
    res=p.getPeso()/(p.getAltura()*2);
            
        if (res<20) {res=-1;
        }else if (res>20 && res<=25) {res=0;
        }else {res=1;}
    
    
    return res; }

}
