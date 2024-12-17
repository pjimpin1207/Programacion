/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array de 5 números aleatorios entre 1 y 100
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        // Mostrar array original
        System.out.println("Array generado (sin ordenar): " + Arrays.toString(numeros));

        // Ordenar el array utilizando Arrays.sort
        ordenarArray(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        // Solicitar un numero  al  usuario.
        System.out.print("Introduce un número para buscar en el array: ");
        int numeroABuscar = scanner.nextInt();

        // Buscar el número usando  método de búsqueda secuencial
        int posicionSecuencial = buscarNumero(numeros, numeroABuscar);

        // Buscar el número usando binarySearch
        int posicionBinarySearch = Arrays.binarySearch(numeros, numeroABuscar);

        // Convertir el resultado de binarySearch si es negativo
        if (posicionBinarySearch < 0) {
            posicionBinarySearch = -1; // Si no encuentra el número, binarySearch devuelve un valor negativo
        }

        // Mostrar resultados
        System.out.println("\nResultado de la búsqueda secuencial:");
        if (posicionSecuencial != -1) {
            System.out.println("El número " + numeroABuscar + " se encuentra en la posición: " + posicionSecuencial);
        } else {
            System.out.println("El número " + numeroABuscar + " no se encuentra en el array.");
        }

        System.out.println("\nResultado de la búsqueda binaria:");
        if (posicionBinarySearch != -1) {
            System.out.println("El número " + numeroABuscar + " se encuentra en la posición: " + posicionBinarySearch);
        } else {
            System.out.println("El número " + numeroABuscar + " no se encuentra en el array.");
        }

        // Comparar los resultados
        System.out.println("\nComparación de resultados:");
        if (posicionSecuencial == posicionBinarySearch) {
            System.out.println("Ambos métodos dan el mismo resultado.");
        } else {
            System.out.println("Los métodos dan resultados diferentes.");
        }
    }

    /**
     * Funcion que ordena un array utilizando Arrays.sort.
     *
     * @param array es el array que se desea.
     */
    public static void ordenarArray(int[] array) {
        Arrays.sort(array);
    }

    /**
     * Método que busca un número en un array de manera secuencial.
     *
     * @param array  El array donde se buscará el número.
     * @param numero El número que se quiere buscar.
     * @return La posición del número en el array si lo encuentra (empezando desde 0), o -1 si no lo encuentra.
     */
    public static int buscarNumero(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i; // Devuelve la posición donde se encontró el número
            }
        }
        return -1; // Devuelve -1 si no encuentra el número
    }
}

