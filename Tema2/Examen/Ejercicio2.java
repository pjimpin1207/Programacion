/*Pablo Jiménez Pinto
*Diseña un programa que solicite un número entero positivo, calcule su factorial y muestre el resultado.
*Si el número es negativo, muestra un mensaje de error y termina el programa.
*/
package examentema2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num = scanner.nextInt();


        if (num < 0) {
            System.out.println("Error: El número no puede ser negativo.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

          
            System.out.println("El factorial de " + num + " es " + factorial + ".");
        }


    }
}
