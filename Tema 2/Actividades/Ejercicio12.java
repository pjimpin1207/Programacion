/*Escribir un programa que pida un valor al usuario y muestre su valor absoluto.
Primero hazlo con la función de Math y luego usando el operador ternario
 */
package tema2;

import java.util.Scanner;

public class Ejercicio12 {
 
    //Operador Math.abs
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        int valorAbsoluto = Math.abs(numero);
        
        System.out.println("El valor absoluto es: " + valorAbsoluto);
        
        scanner.close();
    }
}

/*Operador ternario

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        int valorAbsoluto = Math.abs(numero);
        
        System.out.println("El valor absoluto es: " + valorAbsoluto);
        
        scanner.close();
    }
}

*/