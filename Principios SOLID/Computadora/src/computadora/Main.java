/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

/**
 *
 * @author elmer 
 * Ejemplo del principio de inversion de independencias 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Mouse mouse = new Mouse();

        Computadora computadora = new Computadora(teclado, mouse);
        computadora.encender();
    }

}
