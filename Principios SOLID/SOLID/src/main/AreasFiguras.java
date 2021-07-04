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
public class AreasFiguras {

    public void area(Rectangulo rectangulo) {
        System.out.println(rectangulo.getBase() * rectangulo.getAltura());
    }

    public void area(Triangulo triangulo) {
        System.out.println((triangulo.getBase() * triangulo.getAltura()) / 2);
    }

}
