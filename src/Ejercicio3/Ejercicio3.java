/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int op;
        PrestamoLibro[] listaLibros = null; 

        do {
            System.out.println("--- GESTION DE PRESTAMO DE LIBROS ---");
            System.out.println("1. Ingresar N numero de libros");
            System.out.println("2. Prestar Libro(s)");
            System.out.println("3. Devolver Libro(s)");
            System.out.println("4. Mostrar Informacion de los Libros");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine(); 

            switch (op) {
                case 1:
                    System.out.println("--- REGISTRO DE LIBROS ---");
                    System.out.print("Ingrese la cantidad de libros (N) que desea registrar: ");
                    int n = sc.nextInt();
                    sc.nextLine(); 
                    listaLibros = new PrestamoLibro[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("--Ingresando datos del libro-- " + (i + 1) + ":");
                        System.out.print("Ingrese el titulo: ");
                        String titulo = sc.nextLine();

                        System.out.print("Ingrese el autor: ");
                        String autor = sc.nextLine();

                        System.out.print("Ingrese el estado (disponible, prestado, extraviado): ");
                        String estado = sc.nextLine();

                        System.out.print("Ingrese el numero de paginas: ");
                        int paginas = sc.nextInt();
                        sc.nextLine(); 

                        listaLibros[i] = new PrestamoLibro(titulo, autor, estado, paginas);
                    }
                    System.out.println("Se han registrado los " + n + " libros con exito!");
                    break;

                case 2:
                    if (listaLibros != null) {
                        System.out.println("--- PROCESO DE PRESTAMO ---");
                        for (int i = 0; i < listaLibros.length; i++) {
                            System.out.println("nLibro [" + (i + 1) + "] - Titulo: " + listaLibros[i].titulo);
                            listaLibros[i].prestar();
                        }
                    } else {
                        System.out.println("Error! Primero debe registrar los libros (Opcion 1).");
                    }
                    break;

                case 3:
                    if (listaLibros != null) {
                        System.out.println("--- PROCESO DE DEVOLUCION ---");
                        for (int i = 0; i < listaLibros.length; i++) {
                            System.out.println("Libro [" + (i + 1) + "] - Titulo: " + listaLibros[i].titulo);
                            listaLibros[i].devolver();
                        }
                    } else {
                        System.out.println("Error! Primero debe registrar los libros (Opcion 1).");
                    }
                    break;

                case 4:
                    if (listaLibros != null) {
                        System.out.println("--- MOSTRAR INFORMACION ---");
                        for (int i = 0; i < listaLibros.length; i++) {
                            listaLibros[i].mostrarInfo();
                        }
                    } else {
                        System.out.println("Error! Primero debe registrar los libros (Opcion 1).");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema de biblioteca...");
                    break;

                default:
                    System.out.println("Opcion no valida...!");
            }

        } while (op != 5);

        sc.close();
    }
}
