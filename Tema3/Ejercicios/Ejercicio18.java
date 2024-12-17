/*Diseñar una aplicación que pida al usuario que introduzca
 * una frase por teclado e indique cuántos espacios en blanco tiene.
 */
package tema3;

import java.util.Scanner;


public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar una frase.
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Contar espacios en blanco
        int contadorEspacios = contarEspacios(frase);

        // Mostrar resultado
        System.out.println("La frase contiene " + contadorEspacios + " espacios en blanco.");
    }

    /**
     * Método para contar los espacios en blanco de una cadena.
     *
     * @param texto La cadena en la que se contarán los espacios.
     * @return El número de espacios en blanco.
     */
    public static int contarEspacios(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') { // Verifica si el carácter actual es un espacio
                contador++;
            }
        }
        return contador;
    }
}
