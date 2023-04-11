/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

import java.util.Scanner;

/**
 *
 * @author MAXNAC Crea una clase "Juego" que tenga un método "iniciar_juego" que
 * permita a dos jugadores jugar un juego de adivinanza de números. El primer
 * jugador elige un número y el segundo jugador intenta adivinarlo. El segundo
 * jugador tiene un número limitado de intentos y recibe una pista de "más alto"
 * o "más bajo" después de cada intento. El juego termina cuando el segundo
 * jugador adivina el número o se queda sin intentos. Registra el número de
 * intentos necesarios para adivinar el número y el número de veces que cada
 * jugador ha ganado.
 */
public class Juego {

    private int numPlayer1, numPlayer2, numIntentos;
    //segun facu iniciamos el scanner aqui
    Scanner leer = new Scanner(System.in);

    public Juego() {
    }

    public Juego(int numPlayer1, int numPlayer2, int numIntentos) {
        this.numPlayer1 = numPlayer1;
        this.numPlayer2 = numPlayer2;
        this.numIntentos = numIntentos;
    }

    public int getNumPlayer1() {
        return numPlayer1;
    }

    public void setNumPlayer1(int numPlayer1) {
        this.numPlayer1 = numPlayer1;
    }

    public int getNumPlayer2() {
        return numPlayer2;
    }

    public void setNumPlayer2(int numPlayer2) {
        this.numPlayer2 = numPlayer2;
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public void setNumIntentos(int numIntentos) {
        this.numIntentos = numIntentos;
    }

    public void iniciarJuego() {
        System.out.print("Jugador 1 ingrese un numero: ");
        this.numPlayer1 = leer.nextInt();

        numIntentos = 0;
        do {
            System.out.print("Jugador 2 Adivine el numero ingresado por el J1: ");
            this.numPlayer2 = leer.nextInt();
            if (numPlayer2 == numPlayer1){
                System.out.println("EXCELENTE!! Haz adivinado el numero!");
                break;
            } else if (numPlayer2 > numPlayer1){ 
                System.out.println("Numero incorrecto! (-_-) Mas bajo!");
                numIntentos++;
            } else if (numPlayer2 < numPlayer1){
                System.out.println("Numero incorrecto (-_-) Mas Alto!");
                numIntentos++;
            }
        } while (numIntentos != 5);

        if (numIntentos == 5){
            System.out.println("Se te acabaron los intentos.");
        }


    }

}

    

