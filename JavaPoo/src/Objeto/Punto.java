/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author MAXNAC
 */
public class Punto {

    private double x1, x2, y1, y2;
    Scanner leer = new Scanner(System.in);

    public Punto() {
    }

    public Punto(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void crearPunto() {

        System.out.println("Ingrese x1: ");
        this.x1 = leer.nextDouble();//no es necesario usar this pero queda bonito
        System.out.println("Ingrese y1: ");
        this.y1 = leer.nextDouble();
        System.out.println("Ingrese x2: ");
        this.x2 = leer.nextDouble();
        System.out.println("Ingrese y2: ");
        this.y2 = leer.nextDouble();
        leer.close();//cerra el scanner!

    }

    public void calculateDistance() {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        DecimalFormat df = new DecimalFormat("#.##");//si pones despues del punto mas # se vera mas numero de la coma
        String numeroFormateado = df.format(distance);//hay que poner String para convertir un numero a String
        //double num =  Double.parseDouble(numeroFormateado); aca convertis de String a double

        System.out.println(numeroFormateado);
    }

}
