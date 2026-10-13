/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
public class PrestamoLibro {
     //Atributos 
    String titulo, autor, estado;
    int paginas;
    
     public PrestamoLibro(){
         
     }
    public PrestamoLibro(String titulo, String autor, String estado, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.paginas = paginas;
    }
    //Metodos
    public void prestar() {
        if (this.estado.equalsIgnoreCase("disponible")) {
            this.estado = "prestado";
            System.out.println("Exito! El libro ha sido prestado correctamente.");
        } else {
            System.out.println("Error: No se puede prestar el libro porque su estado actual es: " + this.estado);
        }
    }
    public void devolver() {
        if (this.estado.equalsIgnoreCase("prestado")) {
            this.estado = "disponible";
            System.out.println("Exito! El libro ha sido devuelto y ahora esta disponible.");
        } else {
            System.out.println("Error: No se puede devolver el libro porque no se encontraba prestado (estado actual: " + this.estado + ").");
        }
    }
    public void mostrarInfo() {
        System.out.println("=== INFORMACION DEL LIBRO ===");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Estado actual: " + estado);
    }
}

