/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author MAXNAC
 */
public class Rectangulo2 {
    private int lado1;
    private int lado2;

    public Rectangulo2() {
    }

    public Rectangulo2(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    public int calcularArea(){
        
        return this.lado1*this.lado2;
        
        
    }
}
