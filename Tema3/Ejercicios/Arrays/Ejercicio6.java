/* Diseñar un programa que solicite al usuario que introduzca por teclado 5 números decimales.
 * A continuación, mostrar los números en el mismo orden que se han introducido.
 */
package tema3;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        double[] numeros = new double[5];
        Scanner scanner = new Scanner(System.in);
        
        for (int i=0; i <5; i++) {
            System.out.println("Introduzca números decimales: ");
            numeros[i] = scanner.nextDouble();
        }
        
        System.out.println("Los números introducidos son: ");
        for(int i=0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
            
        
    }
    
}
