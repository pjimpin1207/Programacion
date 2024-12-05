/* Crea un método que reciba un array de enteros y devuelva un entero con la suma de
todos los números del array. Invoca este método desde un main e imprime el resultado.
Nota: tendrás que inicializar el array en el main antes de invocar al método.
*/

package tema3;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        // Iniciaar array
        int[] numeros = {10, 20, 30, 40, 50, 60, 70};
        
        // Invocar método
        int suma = sumarArray(numeros);
        
        System.out.println("La suma de los números del array es: " + suma);
        
    }
    
    // Metodo
    public static int sumarArray (int[] array) {
        int suma = 0;
        for (int numero : array) {
            suma += numero;
        }
        return suma;
    }
}