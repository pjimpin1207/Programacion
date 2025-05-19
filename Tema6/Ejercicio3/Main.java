package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        try {
            Persona p = new Persona(-3);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
