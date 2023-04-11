
import Objeto.Cuenta;
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
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta count = new Cuenta();
        count.crearCuenta();
        System.out.println("Ingrese la cantidad que desea retirar: ");
        int retirar = leer.nextInt();
        count.retirar_dinero(retirar);

    }

}
