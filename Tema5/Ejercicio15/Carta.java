package Ejercicio15;

import java.util.Arrays;

public class Carta {
    private String tipoCarta;
    private String valor;

    public Carta(String[] tipoCarta, String valor) {
        this.tipoCarta = Arrays.toString(tipoCarta);
        this.valor = valor;
    }

    public String gettipoCarta() {
        return tipoCarta;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor + " de " + tipoCarta;
    }
}

