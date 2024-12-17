//Escribe un programa que pida la edad al usuario y muestre la edad que tendrá el año que viene

package tema2;

import java.util.Scanner;

public class Ejercicio2 {
     public static void main (String[] args) {
          System.out.println("Introduzca su edad actual: ");
          Scanner sc = new Scanner (System.in);
           int num = sc.nextInt();
           int operacion = num + 1;
        System.out.println("Tu edad el año que viene es de " + operacion + " años.");
     }
}