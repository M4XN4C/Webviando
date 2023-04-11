/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

import java.util.Scanner;

/**
 *
 * @author MAXNAC
 */
public class Rectangulo {

    private int base, altura;
    Scanner leer = new Scanner(System.in);

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {

        System.out.println("Ingrese Base: ");
        this.base = leer.nextInt();
        System.out.println("Ingrese Altura: ");
        this.altura = leer.nextInt();

    }

    public void resultado() {

        //Superficie = base * altura / Perímetro = (base + altura) * 2.
        System.out.println("Superficie= " + (base * altura));
        System.out.println("Perimetro= " + ((base + altura) * 2));

    }

    public void dibujarRectangulo() {
        String[][] dibu = new String[base][altura];
        //recorre la matriz y pone vacio ""
        for (int i = 0; i < base; i++) {

            for (int j = 0; j < altura; j++) {

                if (i == 0 || j == 0 || i == base - 1 || j == altura - 1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        }

    }


