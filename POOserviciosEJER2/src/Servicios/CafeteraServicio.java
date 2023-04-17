/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera() {
        Cafetera cafe = new Cafetera();

        System.out.println("Cantidad de ML para llenar cafetera");
        cafe.setCapacidadMaxima(leer.nextInt());
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        return cafe;
    }

    public int servirTaza(Cafetera c) {
        System.out.println("cual es el temaño de la taza a servir? en ml");
        int taza;
        taza = leer.nextInt();
        System.out.println("sirviendooo.....");
        if (taza > c.getCantidadActual()) {

            System.out.println("no alcanza para llenar al maximo");
            double porcTaza = (c.getCantidadActual() * 100) / taza;
            System.out.println("la taza quedo en su %" + porcTaza);

        } else {
            System.out.println("se lleno la taza");
        }

        return taza;
    }

    public void vaciarCafetera(Cafetera c) {
        c.setCantidadActual(0);
       

    }
    public void agregarCafe(Cafetera c){
        System.out.println("indique la cantidad de cafe a agregar");
        c.setCantidadActual(leer.nextInt());
        if (c.getCantidadActual()>c.getCapacidadMaxima()) {System.out.println("estas supernado la cantidad maxima que puede tener la cafetera");
        }else System.out.println("llenando....");
        double capcidMax=(c.getCantidadActual()*100)/c.getCapacidadMaxima();
        System.out.println("la cafetera queda en su capacidad de %"+capcidMax);
            
        
    
    }
}
