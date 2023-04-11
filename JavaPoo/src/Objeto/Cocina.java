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
public class Cocina {

    private Receta[] recetas;

    public Cocina() {
    }

    public Cocina(Receta[] recetas) {
        this.recetas = recetas;
    }

    public Receta[] getRecetas() {
        return recetas;
    }

    public void setRecetas(Receta[] recetas) {
        this.recetas = recetas;
    }

    public void buscarReceta(String nombre) {
        for (int i = 0; i < recetas.length; i++) {
            Receta receta = recetas[i];

        }
       

    }

}
