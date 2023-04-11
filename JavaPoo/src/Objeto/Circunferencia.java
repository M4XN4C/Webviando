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
public class Circunferencia {
    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia() {
        
    }

    public Circunferencia(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public void crearCircunferencia (){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        this.radio = leer.nextDouble();
    }
    public double area(){
    //(Area=〖π*radio〗^2)
        return area=Math.PI*radio*radio;
    
    }
    //(Perimetro=2*π*radio).
    public double perimetro(){
    return perimetro= 2*Math.PI*radio;
    }
}
