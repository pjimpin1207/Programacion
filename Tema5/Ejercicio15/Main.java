package Ejercicio15;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BarajaFinal baraja = new BarajaFinal();
        baraja.barajar();

        System.out.println("Se han repartido las siguientes 5 cartas:");
        List<Carta> mano = baraja.repartir(5);
        for (Carta carta : mano) {
            System.out.println(carta);
        }

        System.out.println("\nMano ordenada por tipo de carta y valor:");
        Collections.sort(mano, new ComparadorCarta());
        for (Carta carta : mano) {
            System.out.println(carta);
        }
    }
}
