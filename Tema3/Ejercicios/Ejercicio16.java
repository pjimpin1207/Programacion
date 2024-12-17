/*Introducir por teclado dos frases e indicar cuál de ellas es la
 * más corta, es decir, la que contiene menos caracteres.
 */
package tema3;

 import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar primera frase
        System.out.print("Introduce la primera frase: ");
        String frase1 = scanner.nextLine();

        // Solicitar segunda frase
        System.out.print("Introduce la segunda frase: ");
        String frase2 = scanner.nextLine();

        // Saber cuál es la más corta de las 
        if (frase1.length() < frase2.length()) {
            System.out.println("La primera frase es más corta: \"" + frase1 + "\"");
        } else if (frase1.length() > frase2.length()) {
            System.out.println("La segunda frase es más corta: \"" + frase2 + "\"");
        } else {
            System.out.println("Las dos frases tienen la misma longitud.");
        }
    }
}
