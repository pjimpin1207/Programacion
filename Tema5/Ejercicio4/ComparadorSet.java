package Ejercicio4;

import java.util.*;

public class ComparadorSet {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de Set
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Agregar elementos a cada Set
        String[] elementos = {"Java", "Python", "C++", "JavaScript", "Ruby", "Java"};
        for (String elemento : elementos) {
            hashSet.add(elemento);
            treeSet.add(elemento);
            linkedHashSet.add(elemento);
        }

        // Imprimir cada Set
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Medir tiempo de inserción para cada Set
        medirTiempoInsercion(new HashSet<>());
        medirTiempoInsercion(new TreeSet<>());
        medirTiempoInsercion(new LinkedHashSet<>());

        // Elementos con iterador parte 5
        mostrarElementosConIterador(hashSet);
        mostrarElementosConIterador(treeSet);
        mostrarElementosConIterador(linkedHashSet);

        // Conjunto ordenado con números aleatorios
        SortedSet<Integer> conjuntoAleatorio = new TreeSet<>();
        conjuntoAleatorio.addAll(Arrays.asList(2, 7, 10, 12, 15, 30, 3, 26));
        System.out.println("Conjunto ordenado: " + conjuntoAleatorio);

        // Eliminación de números pares con iterador
        Iterator<Integer> itRemove = conjuntoAleatorio.iterator();
        while (itRemove.hasNext()) {
            int e = itRemove.next(); // Declarar variable correctamente
            if (e % 2 == 0) {
                itRemove.remove();
            }
        }

        System.out.println("Conjunto después de eliminar pares: " + conjuntoAleatorio);
    }

    private static void medirTiempoInsercion(Set<Integer> set) {
        long inicio = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de inserción para " + set.getClass().getSimpleName() + ": " + (fin - inicio) + " ns");
    }

    // Iteración básica parte 5
    private static void mostrarElementosConIterador(Set<String> elementos) {
        Iterator<String> iterator = elementos.iterator();
        int contador = 1;

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println("Elemento #" + contador + ": " + elemento);
            contador++;
        }
    }
}
