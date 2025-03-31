package Ejercicio3;

import java.util.Iterator;
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
        Iterator<Integer> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Igual pero con nombres
        TreeSet<String> conjunto2 = new TreeSet<>();
        conjunto2.add("A");
        conjunto2.add("B");
        conjunto2.add("C");
        conjunto2.add("D");

        System.out.println(conjunto2);

        for (String i : conjunto2) {
            System.out.println(i);
        }
    }
}