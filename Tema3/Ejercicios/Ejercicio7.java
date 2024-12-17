/*Escribir una aplicación que solicite al usuario cuántos números desea introducir.
 *A continuación, introducir por teclado esa cantidad de números enteros, y por último, mostrar en
 *el orden inverso al introducido.
 */
package tema3;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos números deseas introducir? ");
        int cantidad = scanner.nextInt();

        // Crear array para almacenar
        int[] numeros = new int[cantidad];

        System.out.println("Introduce los números:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar números en orden inverso
        System.out.println("Los números en orden inverso son:");
        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
