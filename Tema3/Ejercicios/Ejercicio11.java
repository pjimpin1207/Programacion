
package tema3;

import java.util.Scanner;
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array de 5 números aleatorios entre 1 y 100
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        // Mostrar array.
        System.out.println("Array generado: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Solicitar un número.
        System.out.print("Introduce un número para buscar en el array: ");
        int numeroABuscar = scanner.nextInt();

        // Buscar los numeros con las funciones.
        int posicion = buscarNumero(numeros, numeroABuscar);

        // Resultado
        if (posicion != -1) {
            System.out.println("El número " + numeroABuscar + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El numero " + numeroABuscar + " no se encuentra en el array.");
        }
    }

    /**
     * Funcion para buscar el número del array.
     *
     * @param array El array donde se buscará el número.
     * @param numero El número que se quiere buscar.
     * @return La posición del número en el array si lo encunetra (empezando en 0), si no, -1.
     */
    public static int buscarNumero(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }
}