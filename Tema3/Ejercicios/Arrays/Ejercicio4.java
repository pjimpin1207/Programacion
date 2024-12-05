/*Crear una tabla de longitud 10 que se inicializará con números aleatorios
comprendidos entre 1 y 100. Mostrar la suma de todos los números aleatorios que
se guardan en la tabla.
*/
package tema3;
    import java.util.Random;
public class Ejercicio4 {

    public static void main(String[] args) {

        // Tabla de longitud 10
        int[] tabla = new int[10];
        Random rand = new Random();
        
        // Inicializar la tabla con números aleatorios entre 1 y 100
        int suma = 0;
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = rand.nextInt(100) + 1; // Generar un número aleatorio entre 1 y 100
            suma += tabla[i]; // Suma el número a la variable suma
        }
        
        // Mostrar los números aleatorios generados
        System.out.print("Números aleatorios generados: ");
        for (int numero : tabla) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        //Suma total
        System.out.println("Suma de los números aleatorios: " + suma);
    }
}
    