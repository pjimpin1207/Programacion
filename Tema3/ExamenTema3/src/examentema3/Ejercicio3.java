/* Ejercicio 3

@param Primero hay que pedir al usuario una frase que contenga varias palabras y
luego introducirlas enun array pero sin incluir los espacios en blanco.

@return Devuelve las palabras ordenadas de la Z-A.
*/
package examentema3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in);
             
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();        
       
        String[] palabras = frase.split("\\s+");
        
        System.out.println("Las palabras en la frase son:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}

        
   