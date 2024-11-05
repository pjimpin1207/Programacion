// Escribe un programa que pida un número entero al usuario y muestre por la consola si el número es par o impar.
package tema2;

import java.util.Scanner;
        
public class Ejercicio16 {
public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número entero
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        // Verificar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
}