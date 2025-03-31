package Ejercicio2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio2 {
    public static void main(String[] args) {
        Set<String> alumnos = new LinkedHashSet<>(); // Para HashSet cambiar LinkedHashSet por HashSet

        alumnos.add("Jaime");
        alumnos.add("Alejandro");
        alumnos.add("David");
        alumnos.add("Pablo");

        System.out.println("Los alumnos son: " + alumnos);

        boolean agregarAlumno = alumnos.add("Alejandro");
        System.out.println("¿Se agrego de nuevo? " + agregarAlumno);
        System.out.println("Conjunto después de agregar duplicado: " + alumnos);

        boolean agregarNull = alumnos.add(null);
        System.out.println("¿Se agrego un valor null? " + agregarNull);
        System.out.println("Conjunto después de agregar null: " + alumnos);

        System.out.println("Recorrido del LinkedHashSet:");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
