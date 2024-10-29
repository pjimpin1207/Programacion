/*Diseñar una aplicación que calcule la longitud y el área de una circunferencia.
Para ello, el usuario debe introducir el radio (que puede contener decimales).
Recordamos:
Longitud = 2 π radio
Área = π radio2

Declara PI como una constante.

Alternativamente usa la clase Math de Java

 */
package tema2;

import java.util.Scanner;


public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double radio;
        final double PI=3.14;
        double longitud;
        double area;
        System.out.println("Introduzca el radio: ");
        radio=sc.nextDouble();
        longitud = 2 * PI * radio;
        area = PI * Math.pow(radio, 2);
    
    System.out.printf("La longitud de la circunferencia es: ", longitud);
    System.out.printf("El área de la circunferencia es: ", area);
             
    }
    
}
