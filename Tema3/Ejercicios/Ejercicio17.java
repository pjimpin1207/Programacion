/*Diseñar el juego «Acierta la contraseña». La mecánica del juego es la siguiente: el primer jugador introduce la contraseña; a continuación,
 * el segundo jugador debe teclear palabras hasta que la acierte. Realizar dos versiones; en la primera se facilita el juego indicando
 * si la palabra introducida es mayor o menor alfabéticamente que la contraseña. En la segunda, el programa mostrará la longitud de la contraseña y una cadena
 * con los caracteres acertados en sus lugares respectivos y asteriscos en los no acertados.
*/

package tema3;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        // Crear scanner
        Scanner scanner = new Scanner(System.in);
        
        // Menu
        System.out.println("Selecciona la versión de juego:");
        System.out.println("1. Indicar si la palabra es mayor o menor alfabéticamente.");
        System.out.println("2. Mostrar pistas con caracteres acertados y asteriscos.");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        // Switch para escoger opción

        switch (opcion) {
            case 1:
                versionAlfabetica(scanner);
                break;
            case 2:
                versionConPistas(scanner);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

 
    public static void versionAlfabetica(Scanner scanner) {
        System.out.print("Jugador 1, introduce la contraseña: ");
        String contrasena = scanner.nextLine();

        System.out.println("Jugador 2, intenta adivinar la contraseña.");
        String intento;
        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextLine();
            if (intento.compareTo(contrasena) < 0) {
                System.out.println("La palabra es menor alfabéticamente.");
            } else if (intento.compareTo(contrasena) > 0) {
                System.out.println("La palabra es mayor alfabéticamente.");
            } else {
                System.out.println("¡Felicidades! Has acertado la contraseña.");
            }
        } while (!intento.equals(contrasena));
    }

  
    public static void versionConPistas(Scanner scanner) {
        System.out.print("Jugador 1, introduce la contraseña: ");
        String contrasena = scanner.nextLine();

        System.out.println("Jugador 2, intenta adivinar la contraseña.");
        System.out.println("La longitud de la contraseña es: " + contrasena.length());
        String intento;
        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextLine();
            if (!intento.equals(contrasena)) {
                System.out.println("Pista: " + generarPista(contrasena, intento));
            } else {
                System.out.println("¡Felicidades! Has acertado la contraseña.");
            }
        } while (!intento.equals(contrasena));
    }

}