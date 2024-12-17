/* Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador tendrá que introducir
la solución de la suma de dos números aleatorios comprendidos entre 1 y 100. Mientras la solución introducida
sea correcta, el juego continuará. En caso contrario, el programa terminará y mostrará el número de operaciones
realizadas correctamente.
 */
package tema2;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int operacionCorrecta = 0;
        int respuesta;
        int respuestaCorrecta;

        // Bucle do-while
        do {
            // Generar con random dos números aleatorios.
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;

            
            
            // Pedir respuesta del jugador.
            System.out.println("¿Cuánto es " + num1 + " + " + num2 + "?");
            respuesta = scanner.nextInt();
            respuestaCorrecta = num1 + num2; 
            // Comprobar la respuesta para ver si es la correcta.
            if (respuesta == respuestaCorrecta) {
                operacionCorrecta++;
                System.out.println("¡Correcto! Llevas " + operacionCorrecta + " operaciones correctas.");
            } else {
                System.out.println("¡Incorrecto! El juego ha terminado.");
                System.out.println("¡Número de operaciones correctas: " + operacionCorrecta + "!");
            } 
          //El bucle continua solo si la respuesta es la correcta.
        } while (respuesta == respuestaCorrecta);  
    }
}