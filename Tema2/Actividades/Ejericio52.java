/*Diseñar una funcion con el siguiente prototipo:
static boolean esPrimo (int n)
Esto devuelve true si n es primo y false en caso contrario
*/

package tema2;

/**
 *
 * @author 1DAW2425-06
 */
public class Ejericio52 {
   
// Función que verifica si un número es primo
    public static boolean esPrimo(int n) {
        // Casos base: los números menores que 2 no son primos
        if (n <= 1) {
            return false;
        }
        
        // Si n es 2, es primo
        if (n == 2) {
            return true;
        }
        
        // Si n es par (y mayor que 2), no es primo
        if (n % 2 == 0) {
            return false;
        }

        // Comprobamos divisibilidad desde 3 hasta la raíz cuadrada de n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // Si n es divisible por i, no es primo
            }
        }

        // Si no se encontró ningún divisor, es primo
        return true;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println(esPrimo(11));  // true
        System.out.println(esPrimo(25));  // false
        System.out.println(esPrimo(2));   // true
        System.out.println(esPrimo(1));   // false
        System.out.println(esPrimo(97));  // true
    }
}