package Ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ejercicio5.Persona> personas = new ArrayList<>();
        personas.add(new Ejercicio5.Persona("Juan", 25));
        personas.add(new Ejercicio5.Persona("Ana", 28));
        personas.add(new Ejercicio5.Persona("Ana", 32));

        // Ordenpor nombre
        Collections.sort(personas);
        System.out.println("Orden por nombre:");
        System.out.println(personas);

        // Orden por edad
        personas.sort(new Ejercicio5.Persona.ComparadorPorEdad());
        System.out.println("Orden por edad:");
        System.out.println(personas);

        // Orden por nombre y edad
        personas.sort(new Persona.ComparadorPorNombreYEdad());
        System.out.println("Orden por nombre y edad:");
        System.out.println(personas);
    }
}

}
