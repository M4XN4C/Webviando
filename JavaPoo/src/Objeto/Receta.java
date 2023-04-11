/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author MAXNAC
 */
public class Receta {

    private String nombre;
    private String[] ingredientes;

    public Receta() {
    }

    public Receta(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void rellenarIngrediente() {
        String[] vector = new String[3]; // Declarar un array de 3 strings
        String[] ingredientes = {"queso", "harina", "tomate"};

        for (int i = 0; i < vector.length; i++) {
            vector[i] = ingredientes[i];
        }

    }
}
