/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooserviciosejer2;

import Servicios.CafeteraServicio;
import entidades.Cafetera;

/**
 *
 * @author Usuario
 */
public class POOserviciosEJER2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio cafeS=new CafeteraServicio();
        Cafetera cafe =cafeS.llenarCafetera();
       
        System.out.println("capacidad max"+cafe.getCantidadActual());
        System.out.println("capacidad que llenaste"+cafe.getCantidadActual());
        cafeS.servirTaza(cafe);
        cafeS.vaciarCafetera(cafe);
        cafeS.agregarCafe(cafe);
    }
    
}
