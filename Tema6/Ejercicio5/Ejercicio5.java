package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        inicializarLista(lista);
        System.out.println("Lista: " + lista);
        try {
            rellenarLista(lista, 4);
        } catch (NumeroRepetido e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Lista: " + lista);
    }

    private static void inicializarLista(List<Integer> lista) {
        for (int i = 2; i <= 10; i = i + 2) {
            lista.add(i);
        }
    }

    private static void rellenarLista(List<Integer> lista, Integer entero) throws NumeroRepetido {
        if (lista.contains(entero)) {
            throw new NumeroRepetido("El número ya está en la lista");
        } else {
            lista.add(entero);
        }
    }

}
