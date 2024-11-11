/* Diseñar un programa que muestre, para cada número introducido por teclado, si es oar, si es positivo y su cuadrado. El proceso
se repetira hasta que el número introducido sea 0.
 */
package tema2;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        // Leer el teclado
        Scanner scanner = new Scanner(System.in);

        // Almacenar el número introducido
        int numero = scanner.nextInt();
        System.out.print("Introduce un número o un 0 si quieres salir: ");

        // Iniciar ucle para que se repita mientras el número no sea 0
        while (numero != 0) {

            // Número es par
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }

            // Número es positivo
            if (numero > 0) {
                System.out.println("El número " + numero + " es positivo.");
            } else if (numero < 0) {
                System.out.println("El número " + numero + " es negativo.");
            } else {
                System.out.println("El número es cero.");
            }

            // Cuadrado del número
            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            System.out.print("Introduce otro número o un 0 si quieres salir: ");
            numero = scanner.nextInt();
        }
        System.out.println ("Has salido del programa");
    }
}
    
        
