/* Diseña una aplicación que muestre la edad máxima y mínima de un grupo de alumnos. El usuario introducirá
las edades y terminará escribiendo un -1.
 */
package tema2;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
    // Leer teclado
        Scanner scanner = new Scanner(System.in);
            
    // Declarar variables
        int edad;
        int edadMaxima = 100;  
        int edadMinima = 1;
                
    System.out.println("Introduce las edades de los alumnos o -1 para salir");
    
    // Bucle para la edad
    
        while (true) {
            edad=scanner.nextInt();
            
            if (edad == -1) {
                break; // Cierra el programa
            }
            
            if (edad < 0) {
                System.out.println("La edad no puede ser un número negativo");
            }
            
            if (edad > edadMaxima)  {
                edadMaxima=edad;
        }
            if (edad < edadMinima) {
                edadMinima = edad;
        }
    }
    
        
            System.out.println("La edad máxima es: " + edadMaxima);
            System.out.println("La edad mínima es: " + edadMinima);
    
        
    }
    
}
