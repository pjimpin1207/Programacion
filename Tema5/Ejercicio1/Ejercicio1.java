package Ejercicio1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        HashSet<String> libros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Club de Lectura - Menú:");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del libro: ");
                    String libro = scanner.nextLine();
                    if (libros.add(libro)) {
                        System.out.println("Libro agregado con éxito.");
                    } else {
                        System.out.println("El libro ya existe en la colección.");
                    }
                    break;
                case 2:
                    System.out.println("Lista de Libros:");

                    // for-each
                    System.out.println("Usando for-each:");
                    for (String l : libros) {
                        System.out.println("- " + l);
                        libros.remove("libro2");
                    }

                    // Iterator
                    System.out.println("Usando Iterator:");
                    Iterator<String> iterator = libros.iterator();
                    while (iterator.hasNext()) {
                        System.out.println("- " + iterator.next());
                        iterator.remove();
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida, intentalo de nuevo.");
            }
        }
    }
}
