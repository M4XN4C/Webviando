/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

import java.util.Scanner;

/**
 *
 * @author MAXNAC Crea una clase "Empleado" que tenga atributos como "nombre",
 * "edad" y "salario". Luego, crea un método "calcular_aumento" que calcule el
 * aumento salarial de un empleado en función de su edad y salario actual. El
 * aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del
 * 5% si tiene menos de 30 años.
 *
 */
public class Empleado {

    Scanner leer = new Scanner(System.in);
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getsalario() {
        return salario;
    }

    public void setsalario(double salario) {
        this.salario = salario;
    }

    public void CrearEmpleado() {
        System.out.println("Ingrese nombre del empleado: ");
        this.nombre = leer.nextLine();
        System.out.println("Ingrese edad del empleado: ");
        this.edad = leer.nextInt();
        System.out.println("Ingrese salario del empleado: ");
        this.salario = leer.nextDouble();
    }

    public double calcularAumento() {
        double aumento = 0.0;
        /* que calcule el aumento
        * salarial de un empleado en función de su edad y salario actual. El aumento
        * salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si 
        * tiene menos de 30 años*/
        if (edad > 30) {
            aumento = salario * 0.1;
            salario += aumento;
        } else {
            aumento = salario * 0.05;
            salario += aumento;

        }

        return salario;
    }
}
