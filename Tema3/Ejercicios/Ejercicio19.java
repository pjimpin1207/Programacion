/*
 *Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida.
 *Un ejemplo, la cadena «Hola mundo» quedaría «odnum aloH»
 */
package tema3;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una cadena: ");
        String cadena= scanner.nextLine();
        
        String cadenaInvertida = invertirCadena(cadena);
        
        System.out.println("El resultado es: " + cadenaInvertida);
    }
    
    
      /**
     * Invierte una cadena de caracteres.
     *
     * @param cadena es la cadena a invertir.
     * @return Devuelve la cadena invertida
     */
    public static String invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder();
        
        for (int i= cadena.length() -1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
    }
        return cadenaInvertida.toString();
    }
    
}
