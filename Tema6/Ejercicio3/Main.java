package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Numeros gestor = new Numeros();

        try {
            gestor.añadirNumero(10);
            gestor.añadirNumero(20);
            gestor.añadirNumero(10); // Número duplicado
        } catch (NumeroDuplicado e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Lista actual: " + gestor.getLista());
    }
}
