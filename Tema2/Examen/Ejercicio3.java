/*Pablo Jiménez Pinto
 * Proporciona una función que reciba dos números enteros como parámetros y devuelva el mayor de ellos. 
 *El programa debe pedir los números al usuario y mostrar el resultado.
 *Debes utilizar el operador ternario.
 */
package examentema2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int num1, num2;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Introduce el primer número: ");
        num1 = scanner.nextInt();
    System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextInt();
     
    if (num1>num2) {
        System.out.print("El número mayor es: " + num1);
    } else {
        System.out.print("El número mayor es: " + num2);
    }
    }
}
   
