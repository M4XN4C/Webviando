package Objeto;

import java.util.Scanner;

public class Libro {
    public String ISBN;
    public String titulo;
    public String autor;
    public int numPaginas;
    
    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public Libro() {
       
    }
    
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el ISBN del libro: ");
        this.ISBN = scanner.nextLine();
        
        System.out.print("Ingrese el título del libro: ");
        this.titulo = scanner.nextLine();
        
        System.out.print("Ingrese el autor del libro: ");
        this.autor = scanner.nextLine();
        
        System.out.print("Ingrese el número de páginas del libro: ");
        this.numPaginas = scanner.nextInt();
    }
    
    public void informarLibro() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}

