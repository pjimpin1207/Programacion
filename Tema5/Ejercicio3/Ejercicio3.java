package Ejercicio3;

import java.util.TreeSet;

public class Ejercicio3 {
    public static void main(String[] args) {

        TreeSet<Integer> conjunto = new TreeSet<>();

        conjunto.add(50);
        conjunto.add(40);
        conjunto.add(90);
        conjunto.add(80);

        System.out.println(conjunto);

        for (Integer i : conjunto) {
            System.out.println(i);
        }
//
    }
}