/* Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero,
que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero.
Ejemplos de números casi-cero son el 0,3, el -0,99 o el 0,123; algunos números que no se consideran casi-ceros son: el 12,3, el 0 o el -1.
*/

package tema2;

import java.util.Scanner;

public class Ejercicio18 {
 public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Introducir un número decimal
        System.out.print("Introduce un número decimal: ");
        double numero = scanner.nextDouble();
        
        // Comprobar si el número es casi-cero
        if (numero != 0 && Math.abs(numero) < 1) {
            System.out.println("El número " + numero + " es un número casi-cero.");
        } else {
            System.out.println("El número " + numero + " no es un número casi-cero.");
        }
    }
}
