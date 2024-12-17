/** El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
 * Escribir un programa que compruebe que el rango de valores de un tipo se comporta de forma cíclica, es decir,
 * el valor siguiente al máximo es el valor mínimo
*/
package tema2;

public class Ejercicio4 {
        public static void main(String [] args) {
        short numero = 32767;
        System.out.println("Número de serie: " + numero);
        numero++;
        System.out.println("Número al sumarle 1: " + numero);
        
    
    }
}
