/* Ejercicio 2

@param Primero pido el tamaño de la tabla para poder crearla y una vez dado el tamaño se crea
la tabla.
@return Devuelve la posicion del núemro más grande siendo la primera posicion 0
*/
package examentema3;

 import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la tabla: ");
        int tamañoTabla = scanner.nextInt();
        int[] tabla = hacerTabla(tamañoTabla);
        int posicionMaxima = PosicionMaxima(tabla);
        System.out.println("La posición del número más grande es: " + posicionMaxima);
    }
    public static int[] hacerTabla(int tamaño) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[tamaño];  
        System.out.println("Ingresa los " + tamaño + " números naturales:");
        for (int i = 0; i < tamaño; i++) {
            tabla[i] = scanner.nextInt();
        }
        return tabla;
    }

    public static int PosicionMaxima(int[] tabla) {
        int max = tabla[0];
        int posicion = 0;  
        for (int i = 1; i < tabla.length; i++) {
            if (tabla[i] > max) {
                max = tabla[i];
                posicion = i;
            }
        }

        return posicion;
    }   
}
