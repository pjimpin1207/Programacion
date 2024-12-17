/*Diseñar una función que recibe como parámetros dos números enteros y devuelve el máximo de ambos
Imprimir el valor devuelto por la función dentro del código de la funcion main
*/

package tema2;

public class Ejercicio32  {

    public static int esMaximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
 
        int num1 = 19;
        int num2 = 52;

        // Llamar a la función
        int maximo = esMaximo(num1, num2);

        System.out.println("El máximo entre " + num1 + " y " + num2 + " es: " + maximo);
    }
}