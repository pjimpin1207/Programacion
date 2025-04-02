package Ejercicio5;

import java.util.*;

public class main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Ana", 28));
        personas.add(new Persona("Ana", 32));

        // Ordenpor nombre
        Collections.sort(personas);
        System.out.println("Orden por nombre:");
        System.out.println(personas);

        // Orden por edad
        personas.sort(new Persona.ComparadorPorEdad());
        System.out.println("Orden por edad:");
        System.out.println(personas);

        // Orden por nombre y edad
        personas.sort(new Persona.ComparadorPorNombreYEdad());
        System.out.println("Orden por nombre y edad:");
        System.out.println(personas);
    }
}
