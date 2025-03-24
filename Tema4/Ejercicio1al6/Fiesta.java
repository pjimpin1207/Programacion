package Ejercicio1al6;

import java.util.Scanner;

public class Fiesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la hora inicial
        System.out.println("Introduce la hora (0-23): ");
        int hora = scanner.nextInt();
        System.out.println("Introduce los minutos (0-59): ");
        int minuto = scanner.nextInt();
        System.out.println("Introduce los segundos (0-59): ");
        int segundo = scanner.nextInt();

        // Crear objeto Hora con la hora inicial
        Hora horaActual = new Hora(hora, minuto, segundo);

        // Mostrar la hora introducida
        System.out.println("Hora introducida: ");
        horaActual.mostrarHora();

        // Leer el número de segundos a sumar
        System.out.println("Introduce el número de segundos a sumar: ");
        int n = scanner.nextInt();

        // Sumar los segundos
        horaActual.sumarSegundos(n);

        // Mostrar la hora después de sumar los segundos
        System.out.println("Hora después de sumar " + n + " segundos: ");
        horaActual.mostrarHora();
    }
}