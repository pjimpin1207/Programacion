package Ejercicio11;

import java.util.LinkedList;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Crear la cola de tareas
        LinkedList<String> tareas = new LinkedList<>();

        // Añadir tareas a la cola
        tareas.addLast("Lavar los platos");
        tareas.addLast("Hacer la compra");
        tareas.addLast("Estudiar Java");
        tareas.addLast("Ir al gimnasio");
        tareas.addLast("Leer un libro");

        // Mostrar la cola de tareas
        System.out.println("Cola de tareas:");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }

        // Mostrar tareas
        public static void mostrarTareas (LinkedList < String > listaTareas) {
            System.out.println("Tareas pendientes:");
            for (String tarea : listaTareas) {
                System.out.println("- " + tarea);
            }
        }
    }
}
