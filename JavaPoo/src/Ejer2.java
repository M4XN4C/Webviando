
import Objeto.Circunferencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MAXNAC
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circu = new Circunferencia();
        circu.crearCircunferencia();
        System.out.println("El perimetro es: " + circu.perimetro() + "");
        System.out.println("El área es: " + circu.area() + ".");
        Circunferencia circu2 = new Circunferencia();
        circu2.crearCircunferencia();
        System.out.println("El perimetro es: " + circu2.perimetro() + "");
        System.out.println("El airea es: " + circu2.area() + ".");
    }

}
