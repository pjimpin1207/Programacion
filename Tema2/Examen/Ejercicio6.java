/* Pablo Jiménez Pinto
Escribe un programa que pida un número entero positivo y use una función para determinar si un número es primo.
Debe mostrar todos los números primos hasta el número introducido y, para cada primo, cuántos números compuestos menores que él existen.
Números primos: Son aquellos que solo son divisibles entre 1 y ellos mismos. Ejemplos: 2, 3, 5, 7, etc.
Números compuestos: Son aquellos que no son primos y que son mayores que 1. Ejemplos: 4, 6, 8, 9, etc.
Ejemplo de ejecución:
Si el usuario introduce n = 10, la salida sería:
 */
package examentema2;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Introduzca un numero: ");
        int num = scanner.nextInt();
        
 
    public static boolean calcularPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        
        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false; 
            }
        }
        return false;
}
}

