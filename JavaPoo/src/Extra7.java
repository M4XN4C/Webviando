
import Objeto.Rectangulo2;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAXNAC
 */
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese lado 1 del rectangulo: ");
        int lado1= leer.nextInt();
        System.out.print("Ingrese lado 2 del rectangulo: ");
        int lado2= leer.nextInt();
        Rectangulo2 rectangulo1= new Rectangulo2(lado1,lado2);
        int area = rectangulo1.calcularArea();
        System.out.println("El área del rectangulo es: "+area);
        System.out.println("otra manera...El área del rectangulo es: "+rectangulo1.calcularArea());
        
        
        
    }
    
}
