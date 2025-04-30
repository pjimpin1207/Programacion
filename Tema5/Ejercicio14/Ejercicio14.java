package Ejercicio14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Ordenar
        System.out.println("Ordenados:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Desordenar
        Collections.shuffle(numeros);
        System.out.println("Desordenados:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Ordenar en orden ascendente
        Collections.sort(numeros);
        System.out.println("Orden ascendente:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Invertir
        Collections.reverse(numeros);
        System.out.println("Invertir el orden a descendente:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Buscar un número
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para buscar");
        int nunbuscado = scanner.nextInt();

        if (numeros.contains(nunbuscado)) {
            System.out.println("El número " + nunbuscado + " si está");
        } else {
            System.out.println("El número " + nunbuscado + " no está");
        }


    }
}