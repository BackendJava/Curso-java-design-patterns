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
public class Rectangulo implements IFigura {

    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String toString() {
        return "Base " + this.getBase() + " Altura " + this.getAltura();
    }

    public float area() {
        return this.getBase() * this.getAltura();
    }
}
