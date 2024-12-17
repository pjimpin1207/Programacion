/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir frases al usuario
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        // Pedir la palabra al usuario
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine();

        // Contar las veces que aparece la palabra en la frase
        int contador = contarPalabraEnFrase(frase, palabra);

        // Mostrar  resultado
        System.out.println("La palabra \"" + palabra + "\" aparece " + contador + " veces en la frase.");
    }

    /**
     * Método para contar cuántas veces aparece una palabra en una frase.
     *
     * @param frase La frase en la que se buscará.
     * @param palabra La palabra que se busca.
     * @return El número de veces que aparece la palabra.
     */
    public static int contarPalabraEnFrase(String frase, String palabra) {
        // Eliminar puntuaciones y convertir todo a minúsculas
        frase = frase.replaceAll("[.,;:!?]", "").toLowerCase();
        palabra = palabra.toLowerCase();

        // Dividir la frase en palabras usando espacios como delimitador
        String[] palabras = frase.split(" ");

        int contador = 0;

        // Recorrer cada palabra y contar coincidencias
        for (String p : palabras) {
            if (p.equals(palabra)) {
                contador++;
            }
        }
        return contador;
    }
}

