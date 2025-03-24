package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2022, 4);
        System.out.println("Detalles del coche:");
        coche.mostrarDetalles();

        Motocicleta moto = new Motocicleta("Harley-Davidson", "Sportster", 2021, true);
        System.out.println("Detalles de la motocicleta:");
        moto.mostrarDetalles();
    }
}
