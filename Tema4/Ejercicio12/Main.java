package Ejercicio12;


public class Main {
    public static void main(String[] args) {
        // Crear un array de animales
        Animal[] animales = {
                new Perro("Rex", 5),
                new Gato("Michi", 3),
                new Pajaro("Piolín", 1)
        };

        for (Animal animal : animales) {
            animal.mostrarInformacion();
            if (animal instanceof Pajaro) {
                ((Pajaro) animal).volar();
            }

            System.out.println(); // Espacio entre cada animal
        }
    }
}
