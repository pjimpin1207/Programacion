package Ejercicio6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", "Gómez", 25));
        personas.add(new Persona("Ana", "Martínez", 30));
        personas.add(new Persona("Luis", "Fernández", 20));
        personas.add(new Persona("Carlos", "López", 22));
        personas.add(new Persona("Ana", "Gómez", 28));

        System.out.println("Orden natural (por nombre y edad):");
        Collections.sort(personas);
        personas.forEach(System.out::println);

        System.out.println("\nOrden por edad:");
        personas.sort(new ComparaPorEdad());
        personas.forEach(System.out::println);

        System.out.println("\nOrden por apellido:");
        personas.sort(new ComparaPorApellido());
        personas.forEach(System.out::println);

        System.out.println("\nOrden por apellido, nombre y edad:");
        personas.sort(new ComparaPorApellidoNombreEdad());
        personas.forEach(System.out::println);

        // Ejercicio 7:
        // Primera persona del conjunto
        Iterator it = personas.iterator();
        while (it.hasNext()) {
            System.out.println(personas.next());
        }

        SortedSet<Persona> sortedPersonas = new TreeSet<>(());
        System.out.println("Primero en el SortedSet: " + personas.first);

        // Ultima persona del conjunto
        SortedSet<Persona> sortedPersonas2 = new TreeSet<>(personas);
        System.out.println(personas.last());

        // Anteriores a Juan
        System.out.println("Anteriores a Juan" + personas.headSet(juan));

    }
}
