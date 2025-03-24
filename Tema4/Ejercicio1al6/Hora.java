package Ejercicio1al6;

import java.util.Scanner;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor con parámetros
    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Constructor por defecto
    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    // Getter y Setter para hora
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida.");
        }
    }

    // Getter y Setter para minuto
    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido.");
        }
    }

    // Getter y Setter para segundo
    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido.");
        }
    }

    // Método para mostrar la hora
    public void mostrarHora() {
        System.out.println(String.format("%02d:%02d:%02d", hora, minuto, segundo));
    }

    // Método para sumar n segundos a la hora
    public void sumarSegundos(int n) {
        segundo += n;
        while (segundo >= 60) {
            segundo -= 60;
            minuto++;
            if (minuto >= 60) {
                minuto -= 60;
                hora++;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        }
    }
}