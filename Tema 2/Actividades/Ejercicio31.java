/*Crea una función de nombre variosSaludos que reciba como parámetro un entero n y no devuelva nada, imprimiendo la palabra “Hola” tantas veces como indique n.

Invoca la función con el valor literal 3

Invocala ahora mediante una variable leída por teclado

Finalmente, invocala con el valor doble de n
 */
package tema2;

public class Ejercicio31 {
        public static void main(String[] args) {
            int n = 5;
            variosSaludos(n);
       }
       public static void variosSaludos(int n) {
           for (int i = 0; i < n; i++) {
               System.out.println("Hola");
      
           }
       }
}
