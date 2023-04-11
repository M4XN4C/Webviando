
import Objeto.Empleado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAXNAC
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.CrearEmpleado();
        /*si en la clase empleado ponemos la variable  private se usa empleado.getNombre()
        si es public solamente empleado.nombre //para concatenar en el print*/
        System.out.println("El aumento salarial de "+empleado.getNombre()+" en funcion de su edad es de:\n "+empleado.calcularAumento());
       
    }
    
}
