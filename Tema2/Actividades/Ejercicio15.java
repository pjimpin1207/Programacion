// Realizar un programa que pida como entrada un número decimal y lo muestre redondeado al entero más próximo.
package tema2;

import java.util.Scanner;

public class Ejercicio15 {
public static void main(String[] args) {
        // Leer entrada
        Scanner scanner = new Scanner(System.in);
        
        // Ingresar número decimal
        System.out.print("Introduce un número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        
        // Redondear al número entero más cercano
        int numeroEntero = (int) Math.round(numeroDecimal);
        
        // Mostrar el número redondeado
        System.out.println("Número redondeado: " + numeroEntero);
        
    }
}