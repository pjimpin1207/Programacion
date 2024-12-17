// Pedir tres números y mostrarlos ordenados de mayor a menor

package tema2;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
    // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
    // Variables de los tres números
        int num1, num2, num3;
    
    // Variables para los números ordenados
        int mayor, medio, menor;
        
    // Introducir tres números
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextInt(); // Leer el primer número
        
        System.out.print("Introduce el segundo número: ");
        num2 = scanner.nextInt(); // Leer el segundo número
        
        System.out.print("Introduce el tercer número: ");
        num3 = scanner.nextInt(); // Leer el tercer número
        
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }
        
    // Mostrar números ordenados
        System.out.println("Los números ordenados son: " + mayor + ", " + medio + ", " + menor);
      
        
    }
}