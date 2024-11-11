/* Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4),
suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 у 10).
*/

package tema2;

import java.util.Scanner;

public class Ejercicio20 {
    
public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir la nota al usuario
        System.out.print("Introduce la nota (0 a 10): ");
        int nota = scanner.nextInt();

        // Utilizar el switch para clasificar la nota
        String clasificacion = null;
        switch (nota) {
            case 0: case 1: case 2: case 3: case 4:
                clasificacion = "Insuficiente (0-4)";
                break;
            case 5:
                clasificacion = "Suficiente (5)";
                break;
            case 6:
                clasificacion = "Bien (6)";
                break;
            case 7: case 8:
                clasificacion = "Notable (7-8)";
                break;
            case 9: case 10:
                clasificacion = "Sobresaliente (9-10)";
                break;
        }

        // Mostrar la clasificación
        System.out.println(clasificacion);
        
    }
}