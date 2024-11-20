/*Repetir el ejercicio anterior pero ahora para calcular el máximo de tres números.
Se debe sobrecargar la función, por lo que ambas funciones deben estar en el mismo archivo y tener el mismo identificador.
Opcional: dentro de esta función utiliza la función del ejercicio 32 para realizar los cálculos.
 */
package tema2;

public class Ejercicio33 {

    // Función que devuelve el máximo entre dos números
    public static int obtenerMaximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Sobrecarga
    public static int obtenerMaximo(int a, int b, int c) {
        // Usamos la función obtenerMaximo con dos parámetros para comparar tres números
        int maxAB = obtenerMaximo(a, b);
        return obtenerMaximo(maxAB, c);
    }

    public static void main(String[] args) {
        // Definir tres números para comparar
        int num1 = 15;
        int num2 = 27;
        int num3 = 10;

        // Llamar a la función
        int maximo = obtenerMaximo(num1, num2, num3);

        System.out.println("El máximo entre " + num1 + ", " + num2 + " y " + num3 + " es: " + maximo);
    }
}