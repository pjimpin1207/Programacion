/*Pablo Jiménez Pinto
*Escribe un programa que pida un número entero al usuario,
*determine si es par o impar y muestre el resultado por consola
 */
package examentema2;

import java.util.Scanner;

public class Ejercicio1 {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
}

    
    
