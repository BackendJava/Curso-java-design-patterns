/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

/**
 *
 * @author elmer
 */
public class Computadora {

    private ITeclado teclado;
    private IMouse mouse;

    public Computadora(ITeclado teclado, IMouse mouse) {

        this.teclado = teclado;
        this.mouse = mouse;

    }

    public void encender() {

        this.teclado.conectar();
        this.mouse.conectar();

    }
}
