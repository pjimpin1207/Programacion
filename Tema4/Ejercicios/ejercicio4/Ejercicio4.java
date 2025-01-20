package tema4.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la hora al usuario
        System.out.print("Introduce la hora (0-23): ");
        int hora = scanner.nextInt();
        System.out.print("Introduce el minuto (0-59): ");
        int minuto = scanner.nextInt();
        System.out.print("Introduce el segundo (0-59): ");
        int segundo = scanner.nextInt();

        // Crear el objeto Hora
        Hora horaActual = new Hora(hora, minuto, segundo);

        // Solicitar el número de segundos a mostrar
        System.out.print("Introduce la cantidad de segundos a mostrar: ");
        int n = scanner.nextInt();

        // Mostrar la hora actual y las siguientes n horas
        System.out.println("\nHora inicial: " + horaActual);
        for (int i = 0; i < n; i++) {
            horaActual.incrementarSegundo();
            System.out.println("Siguiente: " + horaActual);
        }
    }
}
