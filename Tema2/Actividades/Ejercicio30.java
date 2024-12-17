/* Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado,
utilizando para ello asteriscos (*). Por ejemplo para n = 4
*/

package tema2;

import java.util.Scanner;

public class Ejercicio30 {          
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.print("Introduzca un valor: ");
        int n = scanner.nextInt();
        

        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= i; j++) {
                System.out.print("*");  
            }
            System.out.println();  //
        }
    }
}

