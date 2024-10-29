/* Escribir una aplicación que pida el año actual y el de nacimiento del usuario.
Debe calcular su edad, suponiendo que en el año en curso el usuario ya haya cumplido años.
*/

package tema2;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca el año actual: ");
            int anoActual = sc.nextInt();
            System.out.println("Introduce tu año de nacimiento: ");
            int anoNacimiento = sc.nextInt();
           
         int edad = anoActual - anoNacimiento;
             
         System.out.println("Tienes " + edad + " años");
     }
}
