package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("COMIENZO PROGRAMA DIVISIÓN");

        try {
            System.out.print("Introduce el dividendo: ");
            int dividendo = sc.nextInt();

            System.out.print("Introduce el divisor: ");
            int divisor = sc.nextInt();

            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException ex) {
            System.err.println("Imposible dividir por 0: " + ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Error de entrada: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("FIN PROGRAMA DIVISIÓN");
            sc.close();
        }
        System.out.println("¿Se ejecuta?");
    }
}