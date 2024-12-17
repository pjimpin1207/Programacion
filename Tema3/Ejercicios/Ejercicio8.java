/*Diseñar la función: int maximo (int t[]), que devuelva el máximo valor contenido en la tabla t.
 */
package tema3;


public class Ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {15, 42, 7, 89, 23};
        int max = maximoArray(numeros);

        // Imprimir valor máximo
        System.out.println("El valor máximo en el array es: " + max);
    }

    // Función que devuelve el valor máximo de un array
    public static int maximoArray(int[] t) {
        int max = t[0]; // Inicializar array
        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        return max;
    }
}
