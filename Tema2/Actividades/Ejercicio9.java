/*Diseñar un algoritmo que nos indique si podemos salir a la calle.
Existen aspectos que influyen en esta decisión: si está lloviendo y si hemos terminado nuestras tareas.

Solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas.
Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de que tengamos que ir a la biblioteca
(para realizar algún trabajo, entregar un libro, etc.). 

Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca.
El algoritmo debe mostrar mediante un booleano (true o false) si es posible que se le otorgue permiso para ir a la calle.
*/

package tema2;

 import java.util.Scanner;

public class Ejercicio9 {

  
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean estaLloviendo = scanner.nextBoolean();

        System.out.print("¿Has terminado las tareas? (true/false): ");
        boolean tareasTerminadas = scanner.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean irBiblioteca = scanner.nextBoolean();

        boolean puedeSalir = !estaLloviendo && tareasTerminadas || irBiblioteca;
        
        System.out.println("¿Puedes salir a la calle? " + puedeSalir);

    }
}
