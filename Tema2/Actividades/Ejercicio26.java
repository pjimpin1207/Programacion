/*Implementa una aplicación Eco que pida al usuario un número y muestre en pantalla la salida:
eco...
eco...
eco...

Se muestra <Eco....> tantas veces como indique el numero introducido. La salida anterior seria para el número 3.
 */
package tema2;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
                
         System.out.println("<Introduzca un número: ");
            numero = scanner.nextInt();
        
    for (int i = 0; i < numero; i++) {
            System.out.println("eco...");
        }
    }
}