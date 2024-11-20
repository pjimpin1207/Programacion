/*Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto.
Para ello se introducirá por teclado la altura (en centímetros) de cada árbol (terminando la introducción de datos cuando se utilice -1 como altura).
Los árboles se identifican mediante etiquetas con números únicos correlativos, comenzando en 0. Diseñar una aplicación que resuelva el problema planteado.
 */
package tema2;

import java.util.Scanner;

public class EjercicioRefuerzo29 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroArbol = 0;
        int altura = 0;
        int maxAltura = -1;
        int maxArbol = -1;
        
        // Leer alturas
        while (true) {
            System.out.print("Introduzca la altura del árbol " + numeroArbol + " (en centímetros), o -1 para finalizar: ");
            altura = scanner.nextInt();
            
            // Si la altura es -1, se termina.
            if (altura == -1) {
                break;
            }
            
            // Comprobar si altura del árbol actual es mayor que la máxima registrada
            if (altura > maxAltura) {
                maxAltura = altura;
                maxArbol = numeroArbol; // Esto guarda la altura del mayor árbol registrado
            }
            
            // Incrementar el número de árbol para el siguiente
            numeroArbol++;
        }
        
        // Árbol más alto
        if (maxArbol != -1) {
            System.out.println("El árbol más alto es el número " + maxArbol + " con una altura de " + maxAltura + " cm.");
        } else {
            System.out.println("No se introdujeron alturas válidas.");
        }
    }
}