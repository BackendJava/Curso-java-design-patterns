/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author elmer
 */
public class Main {

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(10, 20);
        Triangulo triangulo = new Triangulo(10, 5);

        Presentacion presentacion = new Presentacion();

        presentacion.area(rectangulo);
        presentacion.area(triangulo);

    }
}
