/*
 * Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales
 * (mayúsculas, minúsculas y acentuadas). Por ejemplo, "Álvaro Pérez" se mostrará <«lvr Prz».
 */
package tema3;

import java.util.Scanner;

public class Ejercicio20 {


public class EliminarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        // Solicitar el nombre completo al usuario
        System.out.print("Ingrese su nombre completo: ");
        String nombre = scanner.nextLine();
        
        // Eliminar las vocales (mayúsculas, minúsculas y acentuadas)
        String nombreSinVocales = eliminarVocales(nombre);
        
        // Mostrar el resultado
        System.out.println("Nombre sin vocales: " + nombreSinVocales);
    }

    /**
     * Método para eliminar las vocales (mayúsculas, minúsculas y acentuadas) de una cadena.
     *
     * @param cadena La cadena de entrada.
     * @return La cadena sin vocales.
     */
    public static String eliminarVocales(String cadena) {
        // Expresión regular para buscar vocales (incluye mayúsculas, minúsculas y acentuadas)
        return cadena.replaceAll("[aeiouáéíóúAEIOUÁÉÍÓÚ]", "");
    }
}
}

