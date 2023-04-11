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
public class Operacion {

    private double num1, num2;
    Scanner leer = new Scanner(System.in);//lo ponemos aca para poner leer. blablabla

    public Operacion() {
    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese numero 1: ");
        this.num1 = leer.nextDouble();//se ingresa numero del scanner
        System.out.println("Ingrese numero 2: ");
        this.num2 = leer.nextDouble();//aca lo mismo pero numero 2

    }

    public void resultado() {
        
        System.out.println("sumar=" + (num1 + num2));
        System.out.println("restar=" + (num1 - num2));
        if (num1==0 || num2==0) {
            System.out.println("No se puede dividir");                                 
        }else{
            System.out.println("La división es: "+(num1/num2));
        }
        if (num1==0 || num2==0) {
            System.out.println("No se puede multiplicar!!!!");                                 
        }else{
            System.out.println("La multiplicación es: "+(num1*num2));
        }
    }
    
}
