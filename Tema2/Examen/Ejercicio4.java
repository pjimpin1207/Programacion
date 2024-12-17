/*Pablo Jiménez Pinto
 *Implementa un programa que determine si un número decimal introducido por el usuario es un 'casi-cero'.
 *Un número es casi-cero si está entre -1 y 1, pero no es exactamente 0.
 */
package examentema2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Introduce un número decimal: ");
        double numero = scanner.nextDouble();

        if (numero != 0 && Math.abs(numero) < 1) {
            System.out.println("El número " + numero + " es un número casi cero.");
        } else {
            System.out.println("El numero " + numero + " no es un número casi cero.");
        }
    }
}
