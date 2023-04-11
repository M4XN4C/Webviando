/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

import java.util.Scanner;

/**
 *
 * @author MAXNAC Crea una clase "Cuenta" que tenga atributos como "saldo" y
 * "titular". Luego, crea un método "retirar_dinero" que permita retirar una
 * cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca
 * sea negativo después de realizar una transacción de retiro.
 */
public class Cuenta {

    private String titular;
    private double saldo;
    Scanner leer = new Scanner(System.in);

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirar_dinero(int retirar) {
        if (saldo - retirar < 0) {
            System.out.println("Denegado!");
        } else {
            System.out.println("Haz realizado con exito tu retiro!! (^^)"
                    + " SU saldo actual es: " + (saldo - retirar));

        }

    }

    public void crearCuenta() {
        System.out.println("Ingrese nombre: ");
        this.titular = leer.nextLine();//para agregar completo el nombre
        System.out.println("Ingrese saldo que te gustaria tener en tu cuenta bancaria: ");
        this.saldo = leer.nextDouble();

    }
}
