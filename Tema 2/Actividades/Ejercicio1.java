// Diseñar un programa que pida un número al usuario por teclado y a continuación lo muestre por consola.

package tema2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        
        int numero = scanner.nextInt();
        
        System.out.println("El número introducido es: " + numero);
        
    }
}
