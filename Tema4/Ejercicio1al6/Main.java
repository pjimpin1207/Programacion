package Ejercicio1al6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear dos personas con el constructor por defecto
        Persona pepe = new Persona();
        Persona paco = new Persona();

        // Imprimir los valores por defecto
        System.out.println("Persona 1 (pepe): " + pepe);
        System.out.println("Persona 2 (paco): " + paco);

        // Crear dos personas con el constructor con parámetros
        Persona juan = new Persona("Juan", 25, 1.75);
        Persona maria = new Persona("Maria", 30, 1.65);

        // Imprimir los valores personalizados
        System.out.println("Persona 3 (juan): " + juan);
        System.out.println("Persona 4 (maria): " + maria);

        // Comprobar funcionalidad de cumplirAños() y crecer()
        juan.cumplirAnnos();
        maria.crecer(0.05);

        System.out.println("Después de un año y crecimiento:");
        System.out.println("Juan: " + juan);
        System.out.println("Maria: " + maria);

        // Hora

        Scanner scanner = new Scanner(System.in);

        // Pedir la hora al usuario
        System.out.print("Introduce la hora (0-23): ");
        int h = scanner.nextInt();
        System.out.print("Introduce el minuto (0-59): ");
        int m = scanner.nextInt();
        System.out.print("Introduce el segundo (0-59): ");
        int s = scanner.nextInt();

        // Crear objeto Hora
        Hora hora = new Hora(h, m, s);

        // Pedir cuántos segundos mostrar
        System.out.print("Introduce la cantidad de segundos a mostrar: ");
        int n = scanner.nextInt();

        // Mostrar la hora inicial y los n siguientes segundos
        System.out.println("Hora inicial: " + hora.mostrarHora());
        for (int i = 0; i < n; i++) {
            hora.incrementarSegundo();
            System.out.println("Siguiente: " + hora.mostrarHora());
        }

        scanner.close();
    }
}