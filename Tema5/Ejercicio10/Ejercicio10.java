package Ejercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ejercicio10 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
        numeros.add(70);
        numeros.add(80);
        numeros.add(90);
        numeros.add(100);

        ListIterator<Integer> iterador = numeros.listIterator();

        System.out.println("Recorrido hacia adelante:");
        while (iterador.hasNext()) {
            int itnext = iterador.nextIndex();
            Integer numero = iterador.next();
            System.out.print("Índice " + itnext + ": " + numero);

            if (numero > 50) {
                int nuevoValor = numero * 2;
                iterador.set(nuevoValor);
                System.out.print(" -> modificado a " + nuevoValor);
            }

            System.out.println();
        }

        // Mostrar la lista después de modificaciones hacia adelante
        System.out.println("\nLista actualizada tras recorrer hacia adelante:");
        System.out.println(numeros);

        System.out.println("\nRecorrido hacia atrás:");
        while (iterador.hasPrevious()) {
            int itprev = iterador.previousIndex();
            Integer numero = iterador.previous();
            System.out.print("Índice " + itprev + ": " + numero);

            if (numero < 30) {
                iterador.add(25);
                System.out.print(" -> se añadió 25");
            }

            System.out.println();
        }

        // Mostrar la lista después del recorrido hacia atrás
        System.out.println("\nLista final tras recorrido hacia atrás:");
        System.out.println(numeros);
    }
}
