package Ejercicio15;

import java.util.Comparator;

public class ComparadorCarta implements Comparator<Carta> {
    private final String[] ordenValores = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12"
    };
    private final String[] ordentipoCarta = {
            "Corazones", "Diamantes", "Tréboles", "Picas"
    };

    private int indice(String[] array, String valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valor)) return i;
        }
        return -1;
    }

    @Override
    public int compare(Carta c1, Carta c2) {
        int comptipoCarta = Integer.compare(
                indice(ordentipoCarta, c1.gettipoCarta()),
                indice(ordentipoCarta, c2.gettipoCarta())
        );
        if (comptipoCarta == 0) {
            return Integer.compare(
                    indice(ordenValores, c1.getValor()),
                    indice(ordenValores, c2.getValor())
            );
        }
        return comptipoCarta;
    }
}
