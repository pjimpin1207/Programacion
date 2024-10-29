/*Crear una aplicación que calcule la media aritmética de dos notas enteras.
Hay que tener en cuenta que la media puede contener decimales.
 */
package tema2;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca la primera nota: ");
    int nota1 = sc.nextInt();
        System.out.println("Introduce la segunda nota: ");
    int nota2 = sc.nextInt();
           
    double NotaMedia = (nota1 + nota2) / 2.0;
             
    System.out.println("Tu nota media es de :" + NotaMedia);
     }
}
