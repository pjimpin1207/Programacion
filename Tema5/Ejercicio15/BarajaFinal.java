package Ejercicio15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BarajaFinal {
    private List<Carta> cartas;

    public BarajaFinal() {
        String[] tipoCarta = { "Corazones", "Diamantes", "Tréboles", "Picas" };
        String[] valores = {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12"
        };
        cartas = new ArrayList<>();
        for (String carta : tipoCarta) {
            for (String valor : valores) {
                cartas.add(new Carta(tipoCarta, valor));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public List<Carta> repartir(int cantidad) {
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < cantidad && !cartas.isEmpty(); i++) {
            mano.add(cartas.remove(0));
        }
        return mano;
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}
