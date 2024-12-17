/* Pedir dos números enteros y decir si son iguales o no
Modificar el programa para que también diga cual es el mayor
*/

package tema2;

import java.util.Scanner;

public class Ejercicio17 {
 public static void main(String[] args) {
        // Leer entrada
        Scanner scanner = new Scanner(System.in);
        
        // Introducir dos números
        System.out.print("Introduce el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        // Comprobar si los números son iguales
        if (numero1 == numero2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números no son iguales.");
            
            // Comprobar cuál es mayor
            if (numero1 > numero2) {
                System.out.println("El número mayor es: " + numero1);
            } else {
                System.out.println("El número mayor es: " + numero2);
            }
        }
    }
}