package Ejercicio11;

import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> tareas = new LinkedList<>();

        // Añadir tareas iniciales
        tareas.addLast("Lavar los platos");
        tareas.addLast("Hacer la compra");
        tareas.addLast("Estudiar Java");
        tareas.addLast("Ir al gimnasio");
        tareas.addLast("Leer un libro");

        mostrarTareas(tareas);

        // Añadir nueva tarea (por teclado)
        System.out.print("\nIntroduce una nueva tarea: ");
        String nuevaTarea = scanner.nextLine();
        tareas.addLast(nuevaTarea);

        // Completar primera tarea
        String tareaCompletada = tareas.removeFirst();
        System.out.println("\nTarea completada: " + tareaCompletada);

        // Consultar próxima tarea sin eliminarla
        System.out.println("Próxima tarea a realizar: " + tareas.getFirst());

        // Añadir tarea urgente (por teclado)
        System.out.print("\nIntroduce una tarea urgente: ");
        String tareaUrgente = scanner.nextLine();
        tareas.addFirst(tareaUrgente);

        // Mostrar estado final de la cola
        System.out.println("\nEstado final de la cola:");
        mostrarTareas(tareas);

        scanner.close();
    }
    // Mostrar tareas
    public static void mostrarTareas(LinkedList<String> tareas) {
        System.out.println("Tareas pendientes:");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }
}
