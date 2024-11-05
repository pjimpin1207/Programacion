/* Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras que se solicitarán al usuario). 
El programa debe mostrar la nota media del curso como se utiliza en el boletín de calificaciones (solo la parte entera) y como se usa en el expediente académico (con decimales).
*/

package tema2;

import java.util.Scanner;


public class Ejercicio14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Introduce la nota del primer trimestre: ");
        int nota1 = scanner.nextInt();

        System.out.print("Introduce la nota del segundo trimestre: ");
        int nota2 = scanner.nextInt();

        System.out.print("Introduce la nota del tercer trimestre: ");
        int nota3 = scanner.nextInt();
        
        double notaMedia = (nota1 + nota2 + nota3) / 3.0;
        int notaEntera = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Nota media en el expediente académico: " + notaMedia);
        System.out.printf("Nota media en el boletín de calificaciones: " +  notaEntera);
    }
}