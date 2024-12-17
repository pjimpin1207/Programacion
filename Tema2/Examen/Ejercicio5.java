/* Pablo Jiménez Pinto
 *Imprime por consola una escalera numérica de N niveles, de forma que los números
 *en una columna sean todos iguales y en una fila sean todos una serie aritmética hasta N.
 *Ej: N = 5
 */
package examentema2;

import java.util.Scanner;

public class Ejercicio5 {
      public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca un valor: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {            
            for (int j = 1; j <= +i; j++) {
                System.out.print(i);                
            }
            System.out.println();
        }
    }
}