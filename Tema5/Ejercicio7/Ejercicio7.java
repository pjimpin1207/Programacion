package Ejercicio7;

import Ejercicio6.Persona;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio7 {

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
