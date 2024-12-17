/*Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad
(mediante un literal booleano: true o false).
 */
package tema2;

import java.util.Scanner;


public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();
        System.out.println(edad >=18);
    }
    
}